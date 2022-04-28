package superclassshapeanditssubclassescirclerectangleandsquare;

public class Circle extends Shape{
    private double radius = 1.0;

    Circle(){};

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    double getRadius(){
        return this.radius;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

    double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    double getPerimeter(){
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString(){
        return "Circle[Shape[color=" + this.getColor() + ",filled=" + this.isFilled() + "],radius=" + this.radius + "]";    
    }
}
