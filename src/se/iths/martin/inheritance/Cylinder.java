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

    @Override
    public String toString() {
        return "radius=" + radius + "\nheight=" + height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Cylinder guest = (Cylinder) obj;
        return Float.floatToIntBits(radius) == Float.floatToIntBits(guest.radius)
                && Float.floatToIntBits(height) == Float.floatToIntBits(guest.height);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(radius, height);
    }
}
