package Kadai12;

public class Kadai_t {
    public static void main(String[] args) {
        Figure_k[] figs = new Figure_k[2];
        figs[0] = new Rectangle_o(8.0, 10.0);
        figs[1] = new Rectangle_t(4.0, 5.0, "red");

        ((Rectangle_o)figs[0]).makeHalf();
        ((Rectangle_t)figs[1]).makeHalf();


        for(int i=0; i<2; i++){
            if(figs[i] instanceof Rectangle_t){
                System.out.println("r"+(i+1)+"：面積="+figs[i].getArea()+",色="+((Rectangle_t)figs[i]).getColor());
            }else{
                System.out.println("r"+(i+1)+"：面積="+figs[i].getArea());
            }
        }
        

    }

}
