package Kadai11;

public class GreatKnight_t extends Knight_t{
    private int summonPoint;
    public static final int bonuspoint=20;
    public GreatKnight_t(){
        this.magicPoint = 100;
        this.summonPoint = 50;
    }

    public GreatKnight_t(int magicPoint, int sumonPoint){
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

    public void upMagicPoint(){
        this.magicPoint +=bonuspoint;
    }
    
}
