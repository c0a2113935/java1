package lec04;

public class Kadai01o {
    public static void main(String[] args){  
        int[][] nums = {{1,11},{2,22,222,},{3,33,333,3333}};
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j]+", ");
            }
            if(i<nums.length){
                System.out.println();

            }
        }
        
      System.out.println("氏名：吉田拓磨");
      System.out.println("学籍番号：C0A21139");

        
    }
    
}
