package lec02;

public class Kadai01t {
    public static void main(String[] args) {
        int num1 =7;
        int num2 =2;
        int num3 =5;
        int min1 = (num1 < num2)? num1 : num2;
        int min2 = (num3 < min1)? num3 : num1;
        System.out.println("最大値は" + min2 + "です.");
    }
    
}
