package lec02;

public class Kadai03o {
    public static void main(String[] args) {
        int num = (int)(Math.random()*3);
        System.out.println("num="+num);
        switch(num){
        case 0:
            System.out.println("グー");
            break;
        case 1:
            System.out.println("チョキ");
            break;
        case 2:
            System.out.println("パー");
            break;
        default:
            System.out.println("エラー");



        }
    }
    
}
