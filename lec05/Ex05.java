package lec05;

public class Ex05 {
    public static void main(String[] args) {
        abc(5,3.6);
        abc(3.6,5);
    }
    public static void abc(int x,double n){
        System.out.println("int型とdouble型");
    }
    public static void abc(double x ,int n) {
        System.out.println("double型とint型");
        
    }
    
}
