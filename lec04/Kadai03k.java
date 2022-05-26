package lec04;

public class Kadai03k {
    public static void main(String[] args) {
        int[] nums = {58,88,44,87,70,100,57};
        int min =0;
        int max =0;
        int ans =0;

        for (int i=0; i<nums.length;i++){
            if(nums[i]>nums[max]){
                max =i;
            }
        for (int j=0; j<nums.length;j++){
            if(nums[j]<nums[min]){
                min =j;
            }
        
        }

        }
        ans = nums[max]-nums[min];
        
        System.out.println("最高点は："+nums[max]);
        System.out.println("最低点は："+nums[min]);
        System.out.println("最高点と最低点の差は："+ans);
        System.out.println("氏名：吉田拓磨");
        System.out.println("学籍番号：C0A21139");
    }
    
}
