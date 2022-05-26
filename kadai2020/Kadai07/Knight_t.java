package Kadai07;


public class Knight_t {
    private int magicPoint;
    private double speed;  
    void setMagicPoint(int magicPoint){
        this.magicPoint = magicPoint;
    }
    int getMagicPoint(){
        return this.magicPoint;
    }
    void setSpeed(double speed){
        if(speed>40.0){
            this.speed = 40.0;
        }
        else if(speed < 0.0){
            this.speed = 0.0;
        }
        else{
            this.speed = speed;
        }
    }
    double getSpeed(){
        return this.speed;
    }

}
