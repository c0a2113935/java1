package Kadai13;

public class Knight_o {
    private int magicPoint;
    private static int knightNum;

    public Knight_o(){
        this.magicPoint = 50;
        knightNum++;
    }

    public int getMagicPoint(){
        return this.magicPoint;
    }

    public static int getKnightNum(){
        return knightNum;
    }

    public void eat(Food_o food){
        food.count();
    }
}
