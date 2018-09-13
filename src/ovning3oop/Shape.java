package ovning3oop;

public abstract class Shape {

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{Length: " + length + " Width: " + width +"}";
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double length;
    private double width;
}
