package laboration2;

import java.io.Serializable;

public abstract class Engine implements Serializable {

    //https://www.mkyong.com/java/how-to-generate-serialversionuid/

    public String capacityUnits;

    public double getEnergyStore() {
        return energyStore;
    }

    public void setEnergyStore(double energyStore) {
        this.energyStore = energyStore;
    }

    private double energyStore;

}
