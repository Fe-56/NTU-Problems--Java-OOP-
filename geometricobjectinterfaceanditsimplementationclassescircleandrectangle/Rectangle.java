package geometricobjectinterfaceanditsimplementationclassescircleandrectangle;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + this.width + ",length=" + this.length + "]";
    }

    @Override
    public double getArea(){
        return this.width * this.length;
    }

    @Override
    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }
}
