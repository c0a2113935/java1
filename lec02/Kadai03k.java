package lec02;

public class Kadai03k {
    public static void main(String[] args) {
        int temp = 36;
        System.out.println("体温が"+temp+"度のときは.");
        if(temp>=38){
            System.out.println("高熱です.");

        }
        
        else if(temp <=37){
            System.out.println("平熱です.");
        }
        else{
            System.out.println("発熱です.");
        }

    }
    
}
