package cpt1.아이템6불필요한객체;

import java.util.regex.Pattern;

public class RomanNumeral {
    /*
    s.matches(정규식); 으로 작성하면 matches 메서드 호출시 정규식 메모리를 한번만 쓰고 바로 버리므로
    아래처럼 패턴을 캐싱으로 두고 필요할때마다 불러다 쓰게 한다.
     */
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0, 3})"
            + "(X[CL]|L?X{0, 3})(I[XV]|V?I{0, 3})$"
            );
    public static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
