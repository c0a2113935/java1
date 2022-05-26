package Kadai12;

public class Rectangle_k extends Figure_k{
    double base;
    double height;

    public Rectangle_k(double base){
        if(base<5){
            this.base = 5.0;
        }else{
            this.base = base;
        }
        this.height = 10.0;
    }

    public Rectangle_k(Double base, Double height){
        this(base);
        this.height = height;
    }

    @Override
    public double getArea(){
        return base*height/2;
    }
}