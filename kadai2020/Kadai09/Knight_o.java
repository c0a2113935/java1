package Kadai09;

public class Knight_o {
    private int magicPint;
    private static int totalNum=0;
    private static int totalMagicPoint=0;

    public Knight_o(){
        totalNum++;
    }

    public Knight_o(int magicPoint){
        this();
        this.magicPint = magicPoint;
        totalMagicPoint += magicPoint;
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

    static int averageMagicPoint(){
        return totalMagicPoint/totalNum;
    }

    void summon(int sumonPoint){
        this.magicPint -= sumonPoint;
        totalMagicPoint -= sumonPoint;
    }

}
