package Kadai10;

public class Knight_o {
    private int magicPoint;
    private String name;

    public Knight_o(){
        this.magicPoint = 50;
        this.name = "no Name";
    }

    public void setMagicPoint(int magicPoint){
        this.magicPoint = magicPoint;
    }
    public int getMagicPoint(){
        return magicPoint;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
