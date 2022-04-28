package superclassshapeanditssubclassescirclerectangleandsquare;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    Rectangle(){};

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.setColor(color);;
        this.setFilled(filled);;
    }

    double getWidth(){
        return this.width;
    }

    void setWidth(double width){
        this.width = width;
    }

    double getLength(){
        return this.length;
    }

    void setLength(double length){
        this.length = length;
    }

    double getArea(){
        return this.width * this.length;
    }

    double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public String toString(){
        return "Rectangle[Shape[color=" + this.getColor() + ",filled=" + this.isFilled() + "],width=" + this.width + ",length=" + this.length + "]";
     }
}
