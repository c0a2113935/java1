package lec05;

public class Ex06 {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }
    public static int sum(int num) {
        if (num ==1){
            return 2;
        }else{
            return sum(num-1) + 2;
        }
        
        
    }
    
}
