package lec04;

import java.util.Arrays;

public class Kadai01t {
    public static void main(String[] args) {

            int[][] nums1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int[][] nums2;
 
            nums2 = nums1;
            System.out.println("ビフォー");
            System.out.println(Arrays.deepToString(nums1));
            System.out.println(Arrays.deepToString(nums2));
            nums2[0][0] = 666;
            System.out.println("アフター");
            System.out.println(Arrays.deepToString(nums1));
            System.out.println(Arrays.deepToString(nums2));
            System.out.println("氏名：吉田拓磨");
            System.out.println("学籍番号：C0A21139");

        


    }

    
}
