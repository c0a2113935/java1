package Kadai04;

public class Kadai02k {
    public static void main(String[] args) {
        int[] point = {58, 78, 64, 87, 100, 90, 67};
        int sum = 0;
        for(int i=0; i<point.length; i++) {
            sum += point[i];
        }
        System.out.println(sum/point.length);
    }
}
