// 3/7 In-Class exercises

package Wk8_Inheritance;

public class Point3D extends MyPoint {
    private int z;

    Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }

    Point3D() {
        super();
        this.z = 0;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z) {
        super.setXY(x, y);
        this.z = z;
    }

    public int[] getXYZ() {
        int[] XYZ = new int[3];

        XYZ[0] = getX();
        XYZ[1] = getY();
        XYZ[2] = getZ();

        return XYZ;
    }

    public String toString() {
        return String.format("(%d, %d, %d)", getX(),getY(),getZ());
    }
}
