package Kadai13.pkg02_k;

import Kadai13.pkg01_k.*;

public class KnightManager_k {
    public static void main(String[] args) {
        Knight_k tristan = new Knight_k(50);
        Knight_k gareth = new Knight_k(50);
        Knight_k lancelot = new Knight_k(50);
        tristan.setMagicPoint(100);
        lancelot.setMagicPoint(200);

        System.out.println("ランスロットのmagicPoint："+lancelot.getMagicPoint());
        System.out.println("トリスタンのmagicPoint："+tristan.getMagicPoint());
        System.out.println("ガレスのmagicPoint："+gareth.getMagicPoint());
        System.out.println("これまでの騎士の数："+Knight_k.getTotalNum());

    }

}
