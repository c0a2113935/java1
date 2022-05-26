package lec03;

public class Ex04 {
    public static void main(String[] args) {
        int money = 100;
        do {
            System.out.println(money+"万円貯まった");
            money +=5;


        }while(money<100);
        System.out.println(money+"万円！目標達成");

    }
    
}
