package lec02;

public class Ex06 {
    public static void main(String[] args) {
        int math = 90;
        int eng = 60;

        if(math >= 80 && eng >= 80){
            System.out.println("英語と数学両方得意です");
            }
        else if (math >=80 || eng >= 80){
            System.out.println("数学または英語が得意です");

        }
        else {
            System.out.println("どちらもままです");
        }

    }
    
}
