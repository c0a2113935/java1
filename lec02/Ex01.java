package lec02;

public class Ex01 {
    public static void main(String[] args) {
        int money = 120;
        int candy = 0;
        if (money >= 100){
            candy++;
            money -= 100;
        }
        System.out.println("Candy:"+candy);
    
    }
    
}
