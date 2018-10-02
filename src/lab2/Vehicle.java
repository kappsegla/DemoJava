package lab2;

import java.util.Objects;

public class Vehicle {

    private String registrationNumber;
    private String manufacturer;
    private int weight;

    private Person owner;
    private Engine engine;

    public Vehicle(String registrationNumber, String manufacturer, int weight) {
        this.registrationNumber = registrationNumber;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj ) return true;

        if ( !(obj instanceof Car) ) return false;

        //cast to native object is now safe
        Vehicle that = (Vehicle)obj;

        //now a proper field-by-field evaluation can be made
        return this.registrationNumber.equals(that.getRegistrationNumber())
                && this.manufacturer.equals(that.manufacturer)
                && this.weight == that.weight;
                    }

    @Override public int hashCode() {
        //simple one-line implementation
        return Objects.hash(getSigFields());
    }

    /**
     Must be called by BOTH equals and hashCode.
     'sig' as in 'significant'.

     It helps a bit to put the most significant items first, such that
     the equals method can return as soon as possible, by finding
     unequal items rapidly.
     */
    private Object[] getSigFields(){
        Object[] result = { registrationNumber, manufacturer, weight };
        return result;
    }
}
