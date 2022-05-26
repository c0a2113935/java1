package Kadai12;

public class Kadai_o {
    public static void main(String[] args) {
        Rectangle_o r1 = new Rectangle_o(2.0);
        Rectangle_o r2 = new Rectangle_o(8.0, 3.0);
        
        r1.makeHalf();
        r2.makeHalf();

        System.out.println("r1:面積="+r1.getArea());
        System.out.println("r2:面積="+r2.getArea());

    }
}
