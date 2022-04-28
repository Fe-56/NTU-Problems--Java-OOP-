package abstractsuperclassshapeanditsconcretesubclasses;

public class Circle extends Shape{
    protected double radius = 1.0;

    Circle(){}

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    
    @Override
    double getPerimeter(){
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString(){
        return "Circle[Shape[color=" + this.color + ",filled=" + this.filled + "],radius=" + this.radius + "]";
    }
}
