package lec02;

public class Kadai03t {
    public static void main(String[] args) {
        int maxtemp = 37;

        int num;
        if(maxtemp>=24 && maxtemp<28){
            num=0;
        }else if (maxtemp>=28&&maxtemp<31){
            num =1;
        }else if(maxtemp>=31&&maxtemp<35){
            num =2;

        }else if(maxtemp>=35){
            num=3;
        }else{
            num =-1;
        }

        switch(num){
        case 0:
            System.out.println("注意");
            break;
        case 1:
            System.out.println("警戒");
            break;
        case 2:
            System.out.println("厳重注意");
            break;
        case 3:
            System.out.println("運動は原則中止");
            break;
        case -1:
            System.out.println("ほぼ安全");
        
        }


    }
}
