package theballclass;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    
    Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    float getX() {
        return this.x;
    }

    void setX(float x) {
        this.x = x;
    }

    float getY() {
        return this.y;
    }

    void setY(float y){
        this.y = y;
    }

    int getRadius() {
        return this.radius;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    float getXDelta() {
        return this.xDelta;
    }

    void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    float getYDelta() {
        return this.yDelta;
    }

    void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    void move(){
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    void reflectHorizontal(){
        this.xDelta = -this.xDelta;
    }

    void reflectVertical(){
        this.yDelta = -this.yDelta;
    }

    @Override
    public String toString(){
        return "Ball[" + this.x + "," + this.y + ",speed=(" + this.xDelta + "," + this.yDelta + ")]";
    }
}
