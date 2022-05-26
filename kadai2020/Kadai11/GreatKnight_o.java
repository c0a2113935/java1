package Kadai11;

public class GreatKnight_o extends Knight_o{
    private int summonPoint;
    public GreatKnight_o(){
        this.magicPoint = 100;
        this.summonPoint = 50;
    }

    public GreatKnight_o(int magicPoint, int sumonPoint){
        super(magicPoint);
        this.summonPoint = sumonPoint;
    }

    public void setSummonPoint(int summonPoint){
        this.summonPoint = summonPoint;
    }

    public int getSummonPoint(){
        return this.summonPoint;
    }

    @Override
    public void useMagicPoint(){
        super.useMagicPoint();
        this.magicPoint -= 10;
    }

    public void upMagicPoint(int upMagicPoint){
        this.magicPoint += upMagicPoint;
    }

}
