package Kadai13;

public class Food_t {
    private int foodNum;
    public Food_t(int foodNum){
        this.foodNum = foodNum;
    }

    public int getFoodNum(){
        return this.foodNum;
    }

    public void count()throws ShortageException_t{
        if(this.foodNum <= 0){
            ShortageException_t e = new ShortageException_t();
            throw e;
        }else{
            this.foodNum--;
        }
    }

}
