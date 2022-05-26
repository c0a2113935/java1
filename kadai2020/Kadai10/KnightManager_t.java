package Kadai10;

public class KnightManager_t {
    public static void main(String[] args) {
        Knight_t[] Knight= new Knight_t[3];
        Knight[0] = new Knight_t();
        Knight[0].setName("tristan");



        Knight[1] = new Knight_t();
        Knight[1].setName("gareth");
        Knight[1].setMagicPoint(70);


        Knight[2] = new Knight_t();
        Knight[2].setName("lancelot");
        Knight[2].setMagicPoint(20);


        for(int i=0; i<3; i++){
            System.out.println(Knight[i].getName() + ":" + Knight[i].getMagicPoint());
        }

        Food_t food = new Food_t(5);

        for(int i=0; i<3; i++){
            Knight[i].eat(food);
            System.out.println(Knight[i].getName() + "が食べたので残り :" + food.getFoodNum());
        }


    }

}
