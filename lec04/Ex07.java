package lec04;

public class Ex07 {
    public static void main(String[] args) {
        int[] score={63,70,76};
        int[] test =new int[3];
        test[0] = score[0];
        test[1] = score[1];
        test[2] = score[2];
        test[1] = 30;
        for(int i=0; i<score.length; i++) {
            System.out.println("score["+i+"]:" + score[i]);
            System.out.println("test["+i+"]:" + test[i]);
        }

    }

    
}
