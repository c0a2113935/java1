package Kadai05;

public class Kadai01t {
    public static void main(String[] args) {
        System.out.println(sum(54));
    }
    public static int sum(int num) {
        if(num <= 33) {
            return 33;
        }else{
            return sum(num-1) + num;
        }
    }
}
