package Kadai13;

public class Knight_t {
    private int magicPoint;
    private static int knightNum;

    public Knight_t(){
        this.magicPoint = 50;
        knightNum++;
    }

    public int getMagicPoint(){
        return this.magicPoint;
    }

    public static int getKnightNum(){
        return knightNum;
    }

    public void eat(Food_t food){
        try {
            food.count();
        } catch (ShortageException_t e) {
            System.out.println("食料が切れています");
        }

 
    }

}
