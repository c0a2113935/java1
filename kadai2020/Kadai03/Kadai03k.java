package Kadai03;

public class Kadai03k {
    public static void main(String[] args) {
        int i = 10;
        int sum = i;
        System.out.print(i);
        do {
            i++;
            sum += i;
            System.out.print("+" + i);
        } while(i<20);
        System.out.println("=" + sum);
    }
}
