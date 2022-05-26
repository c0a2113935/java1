package Kadai13.pkg01_k;

public class Knight_k {
    private int magicPoint;
    private static int totalNum;

    public Knight_k(int magicPoint){
        this.magicPoint = magicPoint;
        totalNum++;
    }

    public void setMagicPoint(int magicPoint){
        this.magicPoint = magicPoint;
    }

    public int getMagicPoint(){
        return this.magicPoint;
    }

    public static int getTotalNum(){
        return Knight_k.totalNum;
    }
}
