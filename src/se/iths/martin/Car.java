package se.iths.martin;

public class Car {
    private boolean started;
    private Color color;

    //Default Constructor
    public Car() {
        this(false);
    }

    public Car(boolean started) {
        this(started, new Color(0, 0, 0));
    }

    public Car(boolean started, Color color) {
        this.started = started;
        this.color = color;
    }
}
