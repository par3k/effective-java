package cpt1.아이템10equals;

public class Test {
    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "Polish";

        // 대칭성 위반
        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));
    }
}
