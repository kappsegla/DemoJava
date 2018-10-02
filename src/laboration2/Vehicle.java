package laboration2;

public abstract class Vehicle {
    private final String regnr;
    private int weight;
    private Engine engine;
    private Person owner;


    public Person getOwner() {
        return owner;
    }


    public void setOwner(Person owner) {
        if( owner == null)
            throw new IllegalArgumentException();
        this.owner = owner;
    }

    public Vehicle(String regnr, int weight, Engine engine, Person owner) {

        if( owner == null )
            throw new IllegalArgumentException();
        this.regnr = regnr;
        this.weight = weight;
        this.engine = engine;
    }


    public int getWeight() {
        return weight;
    }


    public String getRegnr() {
        return regnr;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }
}
