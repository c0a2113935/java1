package Kadai11;

public class KnightManager_t {
    public static void main(String[] args) {
        Knight_t[] knights = new Knight_t[4];
        knights[0] = new Knight_t();
        knights[1] = new GreatKnight_t();
        knights[2] = new GreatKnight_t(70, 50);
        knights[3] = new GreatKnight_t();
        System.out.println("全騎士の魔力の初期値");
        for(int i=0; i<=3; i++){
            System.out.println(i + ":MP:" + knights[i].getMagicPoint());
        }
        System.out.println("全騎士が魔力を1回使った");

        for(int i=0; i<=3; i++){
            knights[i].useMagicPoint();            
            System.out.println(i + ":MP:" + knights[i].getMagicPoint());
        }

        System.out.println("インデックス1から3の騎士の魔力をアップ");
        for(int i=1; i<=3; i++){
            ((GreatKnight_t) knights[i]).upMagicPoint();
            System.out.println(i + ":MP:" + knights[i].getMagicPoint());
        }

    }
}
