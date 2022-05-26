package lec04;

public class Ex03 {
    public static void main(String[] args) {
        int[] nums = {56,78,90,34,62};
        int max = 0;

        for (int i=0; i<nums.length;i++){
            if(nums[i]<nums[max]){
                max=i;
            }
        }
        System.out.println(nums[max]);
    }

    
}
