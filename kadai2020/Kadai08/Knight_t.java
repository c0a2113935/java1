package Kadai08;

public class Knight_t {
    private int magicPoint;
    private double weight;

    public Knight_t(){
        this.magicPoint = 80;
        this.weight = 70.0;
    }
    public Knight_t(int magicPoint){
        this();
        this.magicPoint = magicPoint;
    }
    public Knight_t(int magicPoint, double weight) {
        this(magicPoint);
        if(weight < 0.0){
            this.weight = 0.0;
        }else if(weight > 100.0){
            this.weight = 100.0;
        }else{
            this.weight = weight;
        }
    }
    public int getMagicPoint(){
        return this.magicPoint;
    }
    public double getWeight(){
        return this.weight;
    }
}
