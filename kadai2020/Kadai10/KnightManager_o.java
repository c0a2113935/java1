package Kadai10;

public class KnightManager_o {
    public static void main(String[] args) {
        Knight_o[] Knight= new Knight_o[3];
        Knight[0] = new Knight_o();
        Knight[0].setName("tristan");

        Knight[1] = new Knight_o();
        Knight[1].setName("gareth");
        Knight[1].setMagicPoint(70);

        Knight[2] = new Knight_o();
        Knight[2].setName("lancelot");
        Knight[2].setMagicPoint(20);
        for(int i=0; i<3; i++){
            System.out.println(Knight[i].getName() + ":" + Knight[i].getMagicPoint());
        }
    }
}
