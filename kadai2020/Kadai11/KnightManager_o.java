package Kadai11;

public class KnightManager_o {
    public static void main(String[] args) {
        Knight_o lancelot = new Knight_o();
        GreatKnight_o bors = new GreatKnight_o(200, 100);
        GreatKnight_o tristan = new GreatKnight_o();

        System.out.println("[各騎士の初期値]");
        System.out.print("lancelot: ");
        System.out.println("MP: "+lancelot.getMagicPoint());

        System.out.print("bors: ");
        System.out.println("MP: " + bors.getMagicPoint() + " SP: " + bors.getSummonPoint());
        System.out.print("tristan: ");
        System.out.println("MP: " + tristan.getMagicPoint() + " SP: " + tristan.getSummonPoint());
        System.out.println("tristanは魔力を2回使った");

        tristan.useMagicPoint();
        tristan.useMagicPoint();
        System.out.print("tristan");
        System.out.println("MP: " + tristan.getMagicPoint() + " SP: " + tristan.getSummonPoint());
        System.out.println("[tristanの魔力を40アップした]");
        tristan.upMagicPoint(40);
        System.out.print("tristan");
        System.out.println("MP: " + tristan.getMagicPoint() + " SP: " + tristan.getSummonPoint());

    }
}
