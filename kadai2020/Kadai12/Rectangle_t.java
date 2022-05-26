package Kadai12;

public class Rectangle_t extends Figure_k implements Resize_o, Color_t{
    double base;
    double height;
    private String color;

    public Rectangle_t(double base){
        if(base<5){
            this.base = 5.0;
        }else{
            this.base = base;
        }
        this.height = 10.0;
        this.color = "black";
    }

    public Rectangle_t(Double base, Double height){
        this(base);
        this.height = height;
    }
    
    public Rectangle_t(Double base, double height, String color){
        this(base, height);
        this.color = color;
    }


    @Override
    public double getArea(){
        return base*height/2;
    }

    @Override
    public void makeHalf(){
        this.base /= 2;
    }

    @Override
    public String getColor(){
        return this.color;
    }

}
