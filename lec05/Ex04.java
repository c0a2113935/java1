package lec05;

public class Ex04 {
    public static void main(String[] args) {
        abc(3.6);
        abc(7); 
    }
    
    public static void abc(double n) {
        System.out.println("double型の引数"+n);
        
    }
    public static void abc(int a){
        System.out.println("int型の引数："+a);
        
    }
}
