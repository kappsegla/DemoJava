package se.iths.martin.zoo;

public class Dog extends Mammal implements Pet{

    @Override
    public void talk() {
        System.out.println("Voff");
    }

    @Override
    public boolean isCute() {
        return true;
    }
}
