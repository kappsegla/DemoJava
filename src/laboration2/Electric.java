package laboration2;

public class Electric extends Engine {

    public Electric() {
        capacityUnits = "kWh";
    }

    @Override
    public String toString() {
        return "Battery size: " + getEnergyStore() + capacityUnits;
    }
}
