package cpt1.아이템10equals;

public final class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "지역코드");
        this.prefix = rangeCheck(prefix, 999, "접두사");
        this.lineNum = rangeCheck(lineNum, 9999, "가입자 번호");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if  (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    /* equals 메서드 재정의
        1. == 연산자를 사용해 입력이 자기 자신의 참조인지 확인
        2. instanceof 연산자로 입력이 올바른 타입인지 확인
        3. 입력을 올바른 타입으로 형변환
        4. 입력한 객체와 자기 자신에 대응되는 핵심 필드들이 모두 일치하는지 하나씩 검사
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof PhoneNumber)) {
            return false;
        }

        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNum == lineNum &&
                pn.prefix == prefix &&
                pn.areaCode == areaCode;
    }

    // 코드 생략...

}
