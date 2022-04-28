package themytriangleandmypointclasses;

public class TestMyTriangle {
    public static void main(String[] args){
        MyTriangle triangle = new MyTriangle(-3, -1, 2, 3, 2, -1);
        System.out.println(triangle);
        System.out.println(triangle.getType());
    }
}
