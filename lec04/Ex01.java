package lec04;

public class Ex01 {
    public static void main(String[] args) {
        //int[] score = new int[3];
        //score[0] = 53;
        //score[1] = 85;
        //score[2] = 72;
        int[] score ={53,85,72};

        //合計
        int sum = score[0]+ score[1]+score[2];
        //平均
        //int average = sum /3;
        int average = sum / score.length;
        System.out.println("合計："+sum);
        System.out.println("平均："+average);
    }
    
}
