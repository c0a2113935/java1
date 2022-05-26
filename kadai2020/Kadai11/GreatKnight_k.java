package Kadai11;

public class GreatKnight_k extends Knight_k {
    private int summonPoint;
    public GreatKnight_k(){
        this.summonPoint = 100;
    }

    public void setSummonPoint(int summonPoint){
        this.summonPoint = summonPoint;
    }

    public int getSummonPoint(){
        return this.summonPoint;
    }
}
