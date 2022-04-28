package superclassshapeanditssubclassescirclerectangleandsquare;

public class Square extends Rectangle{
    Square(){}

    Square(double side){
        super(side, side);
    }
    
    Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    double getSide(){
        return this.getLength();
    }

    void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
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
