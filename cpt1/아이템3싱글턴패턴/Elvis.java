package cpt1.아이템3싱글턴패턴;

// final 필드 방식의 싱글턴
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {}

    public void leaveTheBuilding() {}

}
