package se.iths.martin.inheritance;

public class Point3D extends Point {

    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(Point point, double z) {
        this(point.getX(), point.getY(), z);
        //   super(point);
        //   this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
