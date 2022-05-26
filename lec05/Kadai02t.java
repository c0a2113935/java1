package lec05;

public class Kadai02t {
    public static void main(String[] args) {
        System.out.println(fact(10));
        System.out.println("氏名：吉田拓磨");
        System.out.println("学籍番号：C0A21139");
    }

    public static int fact(int num){
        if(num ==1){
            return 1;
        }else{
            return fact(num-1) *num;
        }

        
    }
    
}
