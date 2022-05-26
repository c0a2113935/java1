package lec05;

public class Kadai02o {
    public static void main(String[] args) {
        int day = 15;
        int ans = day %7;
        
        switch (ans){
            case 1:   
                holiday(day);
                break;
     
            case 2:
                holiday(day);
                break;
            default:
                weekday(day);
        
            
             
        }
        System.out.println("氏名：吉田拓磨");
        System.out.println("学籍番号：C0A21139");
    }
         public static void holiday(int day) {
            System.out.println("The "+ day + "th of this month is a holiday．");
        }
         public static void weekday(int day) {
            System.out.println("The " + day + "th of this month is a weekday.");
         
        }
        
    }

    
 
     
        

    
        
        
