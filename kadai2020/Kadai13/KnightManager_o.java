package Kadai13;

public class KnightManager_o {
    public static void main(String[] args) {
        Knight_o[] knights = new Knight_o[5];
        Food_o food = new Food_o(3);

        for(int i=0; i<5; i++){
            knights[i] = new Knight_o();
        }

        for(int i=0; i<Knight_o.getKnightNum(); i++){
            knights[i].eat(food);
            System.out.print(i+1+"人目,残り="+food.getFoodNum()+"個,");
            try {
                System.out.println("人数/食料数="+Knight_o.getKnightNum()/food.getFoodNum());

            } catch (Exception e) {
                System.out.println("0で割算しています");
            }
        }
    }
}
