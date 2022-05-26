package Kadai12;

public class Rectangle_o extends Figure_k implements Resize_o{
    double base;
    double height;

    public Rectangle_o(double base){
        if(base<5){
            this.base = 5.0;
        }else{
            this.base = base;
        }
        this.height = 10.0;
    }

    public Rectangle_o(Double base, Double height){
        this(base);
        this.height = height;
    }

    @Override
    public double getArea(){
        return base*height/2;
    }

    @Override
    public void makeHalf(){
        this.base /= 2;
    }

}
