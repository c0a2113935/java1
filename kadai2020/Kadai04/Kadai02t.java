package Kadai04;
import java.util.Arrays;

public class Kadai02t {
    public static void main(String[] args) {
        int[][] nums1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] nums2;
        nums2 = new int[3][3];
        for(int i=0; i<nums1.length; i++) {
            for(int j=0; j<nums1[i].length; j++) {
                nums2[i][j] = nums1[i][j];
            }
        }
        System.out.println("ビフォー");
        System.out.println(Arrays.deepToString(nums1));
        System.out.println(Arrays.deepToString(nums2));
        nums2[0][0] = 777;
        System.out.println("アフター");
        System.out.println(Arrays.deepToString(nums1));
        System.out.println(Arrays.deepToString(nums2));
    }
}
