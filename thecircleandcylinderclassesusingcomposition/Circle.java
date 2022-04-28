package thecircleandcylinderclassesusingcomposition;

public class Circle{
    private double radius = 1.0;
    private String color = "red";

    Circle(){};

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    double getRadius(){
        return this.radius;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

    String getColor(){
        return this.color;
    }

    void setColor(String color){
        this.color = color;
    }

    double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString(){
        return "Circle[radius=" + this.radius + ",color=" + this.color + "]"; 
    }
}
