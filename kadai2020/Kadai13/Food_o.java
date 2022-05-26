package Kadai13;

public class Food_o {
    private int foodNum;
    public Food_o(int foodNum){
        this.foodNum = foodNum;
    }

    public int getFoodNum(){
        return this.foodNum;
    }

    public void count(){
        this.foodNum--;
    }
}
