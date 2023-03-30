package Wk5;

public class Triangle {

    private int side1;
    private int side2;
    private int angle1;

    public Triangle(int s1, int s2, int a1) {
        setSide1(s1);
        setSide2(s2);
        setAngle(a1);
        this.side1 = s1;
        this.side2 = s2;
        this.angle1 = a1;
    }

    public String TriangleType(int s1, int s2, int s3) {
        String type;
        if(s1 == s2
                && s2 == s3)  {
            type = "Equilateral";
        } else if (s1 != s2
                && s2 != s3
                && s3 != s1) {
            type = "Scalene";
        } else {
            type = "Isosceles";
        }
        return type;
    }

    public int Perimeter(int s1, int s2, int s3) {
        return s1 + s2 + s3;
    }

    public double Area() {
        return Math.sin(this.angle1) * this.side2 * this.side1 * (1.0/2.0);
    }

    public String toString() {
        return String.format("(%d, %d, %d)", this.side1, this.side2, this.angle1);
    }

    public void setSide1(int s1) {
        if(s1 > 0) {
            this.side1 = s1;
        } else {
            throw new IllegalArgumentException("Unaccepted length");
        }
    }

    public void setSide2(int s2) {
        if(s2 > 0) {
            this.side2 = s2;
        } else {
            throw new IllegalArgumentException("Unaccepted length");
        }
    }
    public void setAngle(int angle) {
        if(angle > 0 && angle < 179) {
            this.angle1 = angle;
        } else {
            throw new IllegalArgumentException("Unaccepted length");
        }
    }

    public int getAngle1() {
        return angle1;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }
}