package Kadai09;

public class KnightManager_k {
    public static void main(String[] args) {
        System.out.println("騎士の数 : " + Knight_k.getTotalNum());
        Knight_k tristan = new Knight_k();
        tristan.setMagicPoint(30);
        System.out.println("騎士の数 : " + Knight_k.getTotalNum());
        System.out.println("トリスタンのmagicPoint : " + tristan.getMagicPoint());
        Knight_k gareth = new Knight_k();
        gareth.setMagicPoint(50);
        System.out.println("騎士の数 : " + Knight_k.getTotalNum());
        System.out.println("ガレスのmagicPoint : " + gareth.getMagicPoint());
        Knight_k lancelot = new Knight_k();
        lancelot.setMagicPoint(70);
        System.out.println("騎士の数 : " + Knight_k.getTotalNum());
        System.out.println("ランスロットのmagicPoint : " + lancelot.getMagicPoint());
    }
}
