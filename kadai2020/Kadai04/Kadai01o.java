package Kadai04;

public class Kadai01o {
    public static void main(String[] args) {
        int[][] nums = {{33, 26}, {65, 45, 40}, {27, 99, 100, 75}};
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j]+", ");
            }
            if(i<nums.length){
                System.out.println();
            }
        }
    }
}
