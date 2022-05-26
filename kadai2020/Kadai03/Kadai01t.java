package Kadai03;

public class Kadai01t {
    public static void main(String[] args) {
        for(int i=0; i<6; i++) {
            int j = 0;
            int y = 0;            
            while(j<25) {
                String t = "#";                
                for(int x=0; x<5; x++) {
                    if(y%2==1) {
                        t = "-";
                    }
                    if(5-i<=j && j<25-i) {
                        System.out.print(t);
                    }
                    j++;
                }
                y++;
            }
            System.out.println();
        }
    }
}
