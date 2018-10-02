package laboration2;

import java.util.Objects;

public class Car extends Vehicle {

    private int passengers;

    public Car(String regnr, int weight, Engine engine,Person owner, int passengers) {
        super(regnr, weight,engine,owner);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Car:{ Regnr: " + getRegnr() + "\nWeight: " + getWeight()
                + "\nPassengers: " + getPassengers() + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Car)) return false;
        Car that = (Car)obj;

        return this.getRegnr().equals(that.getRegnr()) &&
                this.getWeight() == that.getWeight() &&
                this.getPassengers() == that.getPassengers();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRegnr(),getWeight(),getPassengers());
    }
}
