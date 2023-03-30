// 3/7 In-Class exercises

package Wk8_Inheritance;

public class MovablePoint extends MyPoint {
    private int xSpeed;
    private int ySpeed;


    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(int xSpeed, int ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        super();
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(int xSpeed, int ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int[] getSpeed() {
        int[] speed = new int[2];
        speed[0] = getxSpeed();
        speed[1] = getySpeed();
        return speed;
    }

    public String toString() {
        return String.format(super.toString() + ", speed = (%d, %d)", getxSpeed(),getySpeed());
    }

    public MovablePoint move() {
        xSpeed += xSpeed;
        ySpeed += ySpeed;
        return this; // return the full object or either m (the local variable object)
    }
}
