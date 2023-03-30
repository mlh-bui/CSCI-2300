package Wk7_Midterm;

public class Box {
    private float width;
    private float height;
    private float depth;

    /** Default Constructor */

    public Box() {
        this.width = 0;
        this.height = 0;
        this.depth = 0;
    }

    public Box(float w, float h, float d) {
        setWidth(w);
        this.width = w;

        setHeight(h);
        this.height = h;

        setDepth(d);
        this.depth = d;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float w) {
        if(w > 0) {
            this.width = w;
        } else {
            throw new IllegalArgumentException("Negative input");
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float h) {
        if(h > 0) {
            this.height = h;
        } else {
            throw new IllegalArgumentException("Negative input");
        }
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float d) {
        if(d > 0) {
            this.depth = d;
        } else {
            throw new IllegalArgumentException("Negative input");
        }
    }

    public float calculateVolume() {
        return this.depth * this.width * this.height;
    }

    public boolean isEqual(Box b) {
        return b.calculateVolume() == calculateVolume();
    }

    public String toString() {
        return String.format("Depth: %.2f \nHeight: %.2f\nWidth: %.2f",getDepth(),getHeight(),getWidth());
    }
}
