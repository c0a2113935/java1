package Kadai09;

public class KnightManager_t {
    public static void main(String[] args) {
        Knight_t tristan = new Knight_t(30);
        Knight_t gareth = new Knight_t(50);
        Knight_t lancelot = new Knight_t(70);
        tristan.summon(10);
        gareth.summon(15);
        lancelot.summon(1);
        System.out.println("最初のアイテム数 : " + Knight_t.getTotalItem());
        tristan.setMagicPoint(30);
        lancelot.setMagicPoint(70);
        System.out.println("トリスタンのmagicPoint : " + tristan.getMagicPoint());
        System.out.println("ガレスのmagicPoint : " + gareth.getMagicPoint());
        System.out.println("ランスロットのmagicPoint : " + lancelot.getMagicPoint());
        System.out.println("騎士数 : " + Knight_t.getTotalNum());
        System.out.println("平均 magicPoint : " + Knight_t.averageMagicPoint());
        System.out.println("残りのアイテム数 : " + Knight_t.getTotalItem());

    }
}
