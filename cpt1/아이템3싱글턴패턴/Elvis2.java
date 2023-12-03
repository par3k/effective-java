package cpt1.아이템3싱글턴패턴;

// 정적 팩토리 방식의 싱글턴
public class Elvis2 {
    private static final Elvis2 INSTANCE = new Elvis2();
    private Elvis2() {}
    public static Elvis2 getInstance() {return INSTANCE;}
    public void leaveBuilding() {}
}
