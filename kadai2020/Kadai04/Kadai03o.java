package Kadai04;

public class Kadai03o {
    public static void main(String[] args) {
        int[] nums = new int[50];
        for(int i=0; i<nums.length; i++) {
            nums[i] = 0;
        }
        for(int i=2; i<nums.length; i++) {
            for(int j=2; j<i; j++) {
                if(i%j==0) {
                    nums[i] = 1;
                }

            }
        }
        for(int i=2; i<nums.length; i++) {
            if(nums[i] == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
