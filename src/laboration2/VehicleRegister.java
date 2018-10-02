package laboration2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleRegister {

    private List<Vehicle> vehicles = new ArrayList<>();

    public Vehicle createNewCar() {
        //skapa nytt fordon
        //Spara i vehicles
        //returnera det nya fordonet
        return null;
    }

    public boolean deleteVehicle(Vehicle vehicle) {
        vehicle.getOwner().vehicleList.remove(vehicle);
        vehicles.remove(vehicle);
        return true;
    }

    public Vehicle findVehicle(String regnr) {
        for (Vehicle v : vehicles) {
            if (v.getRegnr().equals(regnr))
                return v;
        }
        return null;
    }

    public List<Vehicle> findVehicles(int passengers) {
    return vehicles.stream().filter(vehicle -> vehicle instanceof Car)
             .filter(vehicle -> ((Car)vehicle).getPassengers() == passengers)
             .collect(Collectors.toList());
    }

    public void saveToFile(File file){
        new FilePersistance().save(file,vehicles);
    }

    public void loadFromFile(File file){

    }
}