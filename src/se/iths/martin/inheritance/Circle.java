package se.iths.martin.inheritance;

public class Circle {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "radius=" + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Circle guest = (Circle) obj;
        return Float.floatToIntBits(radius) == Float.floatToIntBits(guest.radius);
    }

    @Override public int hashCode() {
        //simple one-line implementation
        return java.util.Objects.hash(radius);
    }
}
