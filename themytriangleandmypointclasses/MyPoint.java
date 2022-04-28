package themytriangleandmypointclasses;

public class MyPoint {
    private int x;
    private int y;

    MyPoint(){}

    MyPoint(int x, int y){
        this.x = x;
        this.y = y; 
    }
    
    int getX(){
        return this.x;
    }

    void setX(int x){
        this.x = x;
    }

    int getY(){
        return this.y;
    }

    void setY(int y){
        this.y = y;
    }

    int[] getXY(){
        int[] output = {this.x, this.y};
        return output;
    }

    void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }

    double distance(int x, int y){
        int deltaX = x - this.x;
        int deltaY = y - this.y;
        double xSquared = Math.pow(deltaX, 2);
        double ySquared = Math.pow(deltaY, 2);
        double output = Math.sqrt(xSquared + ySquared);
        return output;
    }

    double distance(MyPoint another){
        return distance(another.getX(), another.getY());
    }

    double distance(){
        return distance(0, 0);
    }
}
