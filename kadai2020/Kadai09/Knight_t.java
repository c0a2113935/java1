package Kadai09;

public class Knight_t {
    private int magicPoint;
    private static int totalNum=0;
    private static int totalMagicPoint=0;
    private static int totalItem=10;

    public Knight_t(){
        totalNum++;
    }

    public Knight_t(int magicPoint){
        this();
        this.magicPoint = magicPoint;
        totalMagicPoint += magicPoint;
    }

    void setMagicPoint(int magicPoint){
        totalMagicPoint -= this.magicPoint;
        totalMagicPoint += magicPoint;
        this.magicPoint = magicPoint;
        totalItem--;
    }

    int getMagicPoint(){
        return this.magicPoint;
    }

    static int getTotalNum(){
        return totalNum;
    }

    static int getTotalItem(){
        return totalItem;
    }

    static int averageMagicPoint(){
        return totalMagicPoint/totalNum;
    }

    void summon(int sumonPoint){
        this.magicPoint -= sumonPoint;
        totalMagicPoint -= sumonPoint;
    }

}
