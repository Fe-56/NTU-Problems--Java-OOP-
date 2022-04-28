package thecircleandcylinderclassesusingcomposition;

public class Cylinder{
    private Circle base;   // Base circle, an instance of Circle class
    private double height = 1.0;
    
    // Constructor with default color, radius and height
    public Cylinder() {
       base = new Circle(); // Call the constructor to construct the Circle
    }

    Cylinder(double radius){
        base = new Circle(); // Call the constructor to construct the Circle
        base.setRadius(radius);
    }

    Cylinder(double radius, double height){
        base = new Circle();
        base.setRadius(radius);
        this.height = height;
    }

    Cylinder(double radius, double height, String color){
        base = new Circle();
        base.setRadius(radius);
        this.height = height;
        base.setColor(color);
    }

    double getHeight(){
        return this.height;
    }

    void setHeight(double height){
        this.height = height;
    }

    double getVolume(){
        return this.base.getArea() * this.height;
    }
 }