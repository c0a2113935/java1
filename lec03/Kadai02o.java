package lec03;

public class Kadai02o {
    public static void main(String[] args) {
        int height=0;
        int days =1;
        while(true){
            height+=3;
            if(height>10){
                break;
            }
            days+=1;
            height-=1;

        }
        System.out.println(days+"日");
        System.out.println("氏名：吉田拓磨");
        System.out.println("学籍番号：C0A21139");
        
    }

}
