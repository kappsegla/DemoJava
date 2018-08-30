package se.iths.martin;

public class Point {

    private double x;
    private double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    /**
       @param coords Array with length of 2. First place x, second place y
     */
    public Point(double[] coords){
        this.x = coords[0];
        this.y = coords[1];
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point point) {
        double a = this.x - point.x;
        double b = this.y - point.y;

        double d = Math.sqrt(  a*a + b*b );

        return d;
    }
}
