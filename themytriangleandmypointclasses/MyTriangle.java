package themytriangleandmypointclasses;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString(){
        return "MyTriangle[v1=(" + this.v1.getX() + "," + this.v1.getY() + "),v2=(" + this.v2.getX() + "," + this.v2.getY() + "),v3=(" + this.v3.getX() + "," + this.v3.getY() + ")]";
    }

    double getPerimeter(){
        double side1 = this.v1.distance(v2);
        double side2 = this.v1.distance(v3);
        double side3 = this.v2.distance(v3);
        return side1 + side2 + side3;        
    }

    String getType(){
        Double side1 = this.v1.distance(v2);
        Double side2 = this.v1.distance(v3);
        Double side3 = this.v2.distance(v3);
        String output = new String();

        if (side1.equals(side2) && (side2.equals(side3))){
            output = "Equilateral";
        }

        else if ((side1.equals(side2) && !side1.equals(side3)) || (side2.equals(side3) && !side2.equals(side1)) || (side3.equals(side1) && !side3.equals(side2))){
            output = "Isoceles";
        }

        else if (!side1.equals(side2) && !side2.equals(side3) && !side3.equals(side1)){
            output = "Scalene";
        }

        return output;
    }
}
