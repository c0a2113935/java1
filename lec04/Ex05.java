package lec04;

public class Ex05 {
    public static void main(String[] args) {
        //int[][] score ={{63,70,76},{68,54,80}};
        int[][] score = {{63, 70}, {68, 54, 80, 100}, {55}};


        for (int i=0; i<score.length;i++){
            for(int j=0; j<score[i].length;j++){
                System.out.println("score["+i+"]["+j+"]:"+score[i][j]);
            }
        }
    }
    
}
