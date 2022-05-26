package lec04;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int[] nums ={56,78,90,34,62};
        int tmp;

        for(int i = 0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;i++){
                if(nums[j]<nums[i]){
                    tmp =nums[i];
                    nums[i]=nums[j];
                    nums[j]=tmp;

                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    
}
