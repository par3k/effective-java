package cpt1.아이템9trywithresources;

import java.io.*;

public class Example {
    private static int BUFFER_SIZE = 8;

    /*
    이렇게 구현하면 readLine 메서드내에 익셉션 발생시
    close 하지 못하게된다.
     */
    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    /*
    이렇게 try 안에 리소스로 넣어주면 익셉션이 발생해도 close가 보장된다
     */
    static String firstLineOfFile2(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    /*
    catch 절도 써보기
     */
    static String firstLineOfFile3(String path, String defaultVal) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }

    static void copy(String src, String dst) throws IOException {
        InputStream is = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n = 0;
                while ((n == is.read(buf))) {
                    out.write(buf, 0, n);
                }
            } finally {
                out.close();
            }
        } finally {
            is.close();
        }
    }

    /*
    위보다는 이게 가독성이 좋음
     */
    static void copy2(String src, String dst) throws IOException {
        try (InputStream is = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n = 0;
            while ((n == is.read(buf))) {
                out.write(buf, 0, n);
            }
        }
    }

}
