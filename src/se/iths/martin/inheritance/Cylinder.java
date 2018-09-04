package se.iths.martin.inheritance;

public class Cylinder extends Circle {

    private float height;

    public Cylinder(float radius, float height) {
        super(radius);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
