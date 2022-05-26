package lec03;

public class Kadai02t {
    
    public static void main(String[] args) {
        int p = 2;
        int k = 0;
        int f;
        int sum;

        while(k<3){
            f = 1;
            sum = 0;
            for(f=1; f<p; f++){
                if(p%f==0){
                    sum += f;
                }
            }
            if(sum==p){
                System.out.println("完全数：" + p);
                ++k;
            }
            p++;
        }
    }
}
    

