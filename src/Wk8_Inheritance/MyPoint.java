// 3/7 In-Class exercises

package Wk8_Inheritance;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] XY = new int[2];
        XY[0] = getX();
        XY[1] = getY();
        return XY;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%d, %d)", getX(),getY());
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y -y), 2));
    }

    public double distance(MyPoint p) {
        //return Math.sqrt(Math.pow((p.x - x),2) + Math.pow((p.y -y), 2));
        return distance(p.x,p.y);
    }

    public double distance() {
        return distance(0,0);
    }
}
