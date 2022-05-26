package lec05;

import java.util.Arrays;

public class Kadai03o {
    public static void main(String[] args) {
        int[] nums1 ={8,44,81,32,69};
        int num;
    
        num = max(nums1);
    
        System.out.println("nums1 : " + Arrays.toString(nums1));
        System.out.println("num-max : " + num);
        System.out.println("氏名：吉田拓磨");
        System.out.println("学籍番号：C0A21139");
        
    }
    public static int max(int[] arys){
        int max = 0;
        for(int i = 0;i<arys.length;i++){
            if (max<arys[i]){
                max= arys[i];
            }
        }
        return max;

        
        
    }


    
}
