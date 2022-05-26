package Kadai04;

import java.util.Arrays;

public class Kadai01t {
    public static void main(String[] args) {
        int[][] nums1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] nums2;
        //for(int i=0; i<nums1.length; i++) {
        //    nums2[i] = nums1[i]
        //}
        nums2 = nums1;
        System.out.println("ビフォー");
        System.out.println(Arrays.deepToString(nums1));
        System.out.println(Arrays.deepToString(nums2));
        nums2[0][0] = 777;
        System.out.println("アフター");
        System.out.println(Arrays.deepToString(nums1));
        System.out.println(Arrays.deepToString(nums2));
    }
}
