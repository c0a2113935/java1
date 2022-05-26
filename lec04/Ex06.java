package lec04;

public class Ex06 {
    public static void main(String[] args) {
        int[] score={63,70,76};
        int[] test=score;
        test[1] =30;
        for (int i=0;i<score.length;i++){
            System.out.println("score["+i+"]:" + score[i]);
            System.out.println("test["+i+"]:" + test[i]);


        }


    }
    
    
}
