package geometricobjectinterfaceanditsimplementationclassescircleandrectangle;

public class Circle implements GeometricObject{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    }

    @Override
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter(){
        return Math.PI * this.radius * 2;
    }
}
