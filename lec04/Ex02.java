package lec04;

public class Ex02 {
    public static void main(String[] args) {
        int[] score = {53,85,72,90};

        //合計
        int sum = 0;
        for (int i=0; i<score.length;i++){
            sum += score[i];
        }

        //平均
        int average = sum /score.length;
        System.out.println("合計:"+sum);
        System.out.println("平均"+average);
    }
    
}
