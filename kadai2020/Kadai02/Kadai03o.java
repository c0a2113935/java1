package Kadai02;

public class Kadai03o {
    public static void main(String[] args) {
        int num = (int)(Math.random()*3);
        System.out.println("num=" + num);
        switch (num) {
            case 0:
            System.out.println("Rock");
            break;
            case 1:
            System.out.println("Scissors");
            break;
            case 2:
            System.out.println("Paper");
            break;
            default:
            System.out.println("0~2の値を入れてください");
        }
    }
}
