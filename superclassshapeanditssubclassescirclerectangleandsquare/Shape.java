package superclassshapeanditssubclassescirclerectangleandsquare;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    Shape(){};

    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    String getColor(){
        return this.color;
    }

    void setColor(String color){
        this.color = color;
    }

    boolean isFilled(){
        return this.filled;
    }

    void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString(){
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }
}
