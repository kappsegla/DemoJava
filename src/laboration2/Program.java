package laboration2;

public class Program {

    public static void main(String[] args) {

        Vehicle vehicle = new Car("abc123",1480,new Petrol(),new Person(),4);
        System.out.println(vehicle);
    }
}
