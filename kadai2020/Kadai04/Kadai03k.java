package Kadai04;

public class Kadai03k {
    public static void main(String[] args) {
        int[] point = {58, 78, 64, 87, 100, 90, 67};
        int max = 0;
        int min = 0;
        for(int i=0; i<point.length; i++) {
            if(point[i]>point[max]){
                max = i;
            }
            if(point[i]<point[min]){
                min = i;
            }
        }
        System.out.println("最高点は:"+point[max]);
        System.out.println("最低点は:"+point[min]);
        System.out.println("最高・最低点の差は:"+(point[max]-point[min]));
    }
}
