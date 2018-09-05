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
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Cylinder guest = (Cylinder) obj;
        return Float.floatToIntBits(getRadius()) == Float.floatToIntBits(guest.getRadius())
                && Float.floatToIntBits(height) == Float.floatToIntBits(guest.height);
    }
}
