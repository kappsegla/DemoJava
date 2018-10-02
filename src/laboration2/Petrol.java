package laboration2;

public class Petrol extends Engine {

    public Petrol() {
        capacityUnits = "liters";
    }

    @Override
    public String toString() {
        return "Fuel Capacity: " + getEnergyStore() + capacityUnits;
    }
}
