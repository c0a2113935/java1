package Kadai02;

public class Kadai02t {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        
        if(!(x < 10 || y > 15) && !(x > 10 || y < 15)) {
            System.out.println("Success.");
        }
        else {
            System.out.println("failure.");
        }
    }
}
