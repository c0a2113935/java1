package lec03;

public class Kadai3o {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            for(int k=i; k>0; k--) {
                System.out.print(" ");
            }
            for(int s=9-(i*2);s>0;s--) {
               System.out.print("$");
            }
            System.out.println();

        }
        System.out.println("氏名：吉田拓磨");
        System.out.println("学籍番号：C0A21139");


    }
    
    
}
