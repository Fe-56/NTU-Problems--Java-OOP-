package abstractsuperclassshapeanditsconcretesubclasses;

public class Square extends Rectangle{
    Square(){}

    Square(double side){
        this.length = side;
        this.width = side;
    }

    Square(double side, String color, boolean filled){
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    double getSide(){
        return this.length;
    }

    void setSide(double side){
        this.length = side;
        this.width = side;
    }

    @Override
    void setWidth(double side){
        this.setSide(side);
    }

    @Override
    void setLength(double side){
        this.setSide(side);
    }

    @Override
    public String toString(){
        return "Square[Rectangle[Shape[color=" + this.getColor() + ",filled=" + this.isFilled() + "],width=" + this.getWidth() + ",length=" + this.getLength() + "]]";
    }
}
