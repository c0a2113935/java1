package Kadai08;

public class KnightMaganer_t {
    public static void main(String[] args) {
        Knight_t lancelot = new Knight_t(10);
        Knight_t bors = new Knight_t(60, -88.8);
        System.out.println("lancelot: magicPoint=" + lancelot.getMagicPoint() + " weight=" + lancelot.getWeight());
        System.out.println("bors: magicPint=" + bors.getMagicPoint() + " weight=" + bors.getWeight());
    }
}
