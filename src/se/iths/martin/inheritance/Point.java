package se.iths.martin.inheritance;

import java.util.ArrayList;

public class Point {

    private double x;
    private double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @param point
     */
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

    /**
     *
     * @param point another point i space
     * @return distance in 2D x,y-plane to point
     */
    public double distanceTo(Point point) {
        double a = this.x - point.x;
        double b = this.y - point.y;

        double d = Math.sqrt(  a*a + b*b );

    ArrayList<Integer> i = new ArrayList<>();
        i.add(2);

        return d;
    }

    @Override
    public String toString( ) {
        return super.toString();
    }
}
