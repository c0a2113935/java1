package lec05;

public class Ex03 {
    public static void main(String[] args) {
        double[] nums = {1.5,3.3,5.8,2.9,4.5};
        double sum = sum_arys(nums);
        System.out.println("配列の要素の和"+sum);
    }
    public static double sum_arys(double[] arys){
        double sum = 0 ;
        for(int i =0;i<arys.length;i++){
            sum += arys[i];

        }
        return sum;
        
        
    }
    
}
