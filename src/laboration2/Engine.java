package laboration2;

public abstract class Engine {

    public String capacityUnits;

    public double getEnergyStore() {
        return energyStore;
    }

    public void setEnergyStore(double energyStore) {
        this.energyStore = energyStore;
    }

    private double energyStore;

}
