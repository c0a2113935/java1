package Kadai11;

public class KnightManager_k {
    public static void main(String[] args) {
        GreatKnight_k lancelot = new GreatKnight_k();
        System.out.println("lancelot: MP: " + lancelot.getMagicPoint() + " SP: " + lancelot.getSummonPoint());
        lancelot.SetMagicPoint(100);
        lancelot.useMagicPoint();
        lancelot.setSummonPoint(150);
        System.out.println("lancelot: MP: " + lancelot.getMagicPoint() + " SP: " + lancelot.getSummonPoint());


    }
}
