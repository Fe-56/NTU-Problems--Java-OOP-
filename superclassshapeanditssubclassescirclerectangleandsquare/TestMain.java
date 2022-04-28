package superclassshapeanditssubclassescirclerectangleandsquare;

public class TestMain {
    public static void main(String[] args){
        Circle circle = new Circle();
        circle.setRadius(2);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getColor());

        Square square = new Square();
        square.setSide(10);
        System.out.println(square.getArea());
        System.out.println(square.getColor());
        System.out.println(square.getPerimeter());
        System.out.println(square.getWidth());
        System.out.println(square);
    }
}
