package Kadai07;

public class KnightManager_t {
    public static void main(String[] args) {
        Knight_t lancelot = new Knight_t();
        Knight_t bors = new Knight_t();
        lancelot.setMagicPoint(50);    
        lancelot.setSpeed(35.3);
        bors.setMagicPoint(80);
        bors.setSpeed(-35.3);

        System.out.println(lancelot.getMagicPoint());
        System.out.println(lancelot.getSpeed());
        System.out.println(bors.getMagicPoint());
        System.out.println(bors.getSpeed());
    }
}
