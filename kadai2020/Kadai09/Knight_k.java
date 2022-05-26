package Kadai09;

public class Knight_k {
    private int magicPint;
    private static int totalNum=0;

    public Knight_k(){
        totalNum++;
    }

    void setMagicPoint(int magicPint){
        this.magicPint = magicPint;
    }

    int getMagicPoint(){
        return this.magicPint;
    }

    static int getTotalNum(){
        return totalNum;
    }
}
