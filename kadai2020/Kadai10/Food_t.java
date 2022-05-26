package Kadai10;

public class Food_t {
    private int foodNum;
    public Food_t(int foodNum){
        this.foodNum = foodNum;
    }

    public int getFoodNum(){
        return this.foodNum;
    }
    public void count(){
        this.foodNum--;
        return;
    }
}
