package Kadai03;

public class Kadai03o {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            int k=0;
            for(k=0; k<i; k++) {
                System.out.print(" ");
            }
            for(int s=0; s<9-k*2; s++) {
               System.out.print("#");
            }
            System.out.println();
        }
    }
}
