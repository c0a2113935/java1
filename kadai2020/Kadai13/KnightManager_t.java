package Kadai13;

public class KnightManager_t {
    public static void main(String[] args) {
        Knight_t[] knights = new Knight_t[5];
        Food_t food = new Food_t(3);

        for(int i=0; i<5; i++){
            knights[i] = new Knight_t();
        }

        for(int i=0; i<Knight_t.getKnightNum(); i++){
            knights[i].eat(food);
            System.out.print(i+1+"人目,残り="+food.getFoodNum()+"個,");
            try {
                System.out.println("人数/食料数="+Knight_t.getKnightNum()/food.getFoodNum());

            } catch (Exception e) {
                System.out.println("0で割算しています");
            }
        }

    }
}
