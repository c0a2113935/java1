package lec03;

public class Ex06 {
    public static void main(String[] args) {
        int x =1;
        while(x<100){
            System.out.println("x="+x);
            if(x==3){
                break;
            }
            x++;
        }
        System.out.println("END");
    }
    
}
