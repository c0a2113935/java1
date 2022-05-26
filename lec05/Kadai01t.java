package lec05;

public class Kadai01t {
    public static void main(String[] args) {
        System.out.println(sum(100));
        System.out.println("氏名：吉田拓磨");
        System.out.println("学籍番号：C0A21139");
    }
    public static int sum(int num){
        if(num==10){
            return 10;
        }else{
            return sum(num-1) + num;
        }
        

        
    }
    
}
