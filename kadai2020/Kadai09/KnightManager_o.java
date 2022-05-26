package Kadai09;


public class KnightManager_o {
    public static void main(String[] args) {
        Knight_o tristan = new Knight_o(30);
        Knight_o gareth = new Knight_o(50);
        Knight_o lancelot = new Knight_o(70);
        tristan.summon(10);
        gareth.summon(15);
        lancelot.summon(1);
        System.out.println("召喚魔法を使った");
        System.out.println("トリスタンのmagicPoint : " + tristan.getMagicPoint());
        System.out.println("ガレスのmagicPoint : " + gareth.getMagicPoint());
        System.out.println("ランスロットのmagicPoint : " + lancelot.getMagicPoint());
        System.out.println("騎士数 : " + Knight_o.getTotalNum());
        System.out.println("平均 magicPoint : " + Knight_o.averageMagicPoint());
    }
}
