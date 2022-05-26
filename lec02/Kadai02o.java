package lec02;

public class Kadai02o {
    public static void main(String[] args) {
        int price;
        int notexprice = 5000;
        int date = 202004; 
        boolean cashless = true;
        if((date>=202104) && (cashless == false)){
            price=(int)(notexprice*1.10);
        }
        else if((date>=202104) && (cashless=true)){
            price=(int)(notexprice * 1.10 * 0.95);
        }
        else{
            price=(int)(notexprice * 1.08);
            

        }
        
        System.out.println(price+"円です");





    }
    
}
