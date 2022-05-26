package Kadai03;

public class Kadai02o {
    public static void main(String[] args) {
        int height = 0;
        int days = 1;
        while(true) {
            height += 4;
            if(height>=20) {
                break;
            }
            days += 1;
            height -= 1;             
        }
        System.out.println(days + "日");
    }
}
