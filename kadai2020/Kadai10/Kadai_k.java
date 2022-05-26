package Kadai10;
import java.util.Random;
public class Kadai_k {
    public static void main(String[] args) {
        Random r = new Random();
        String str = "52322, Nishikamata, Ota-ku, Tokyo";
        double a = 45.1;
        double b = -78.8;
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(7, 19));
        System.out.println(str.replace("Tokyo", "JPN"));
        System.out.println(Integer.parseInt(str.substring(0, 3))+200);
        System.out.println(Math.sqrt(a));
        System.out.println(Math.round(a));
        System.out.println(Math.min(Math.abs(a), Math.abs(b)));
        for(int i=0; i<5; i++){
            System.out.print(r.nextInt(10)+1 + ",");
        }
    }
}
