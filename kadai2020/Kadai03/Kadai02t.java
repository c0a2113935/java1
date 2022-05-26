package Kadai03;

public class Kadai02t {
    public static void main(String[] args) {
        for(int i=0; i<6; i++) {
            int j = 0;
            while(true) {                
                for(int x=0; x<=i; x++) {
                    j++;                    
                    if(j>20) {
                        break;
                    }                    
                    System.out.print("-");
                }
                j++;                
                if(j>20) {
                    break;
                }                
                System.out.print("#");
            }
            System.out.println();
        }
    }
}