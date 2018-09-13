package se.iths.martin.zoo;

public class Dog extends Mammal implements Pet{


    @Override
    public boolean isCute() {
        return true;
    }

    @Override
    final public void talk() {
        System.out.println("Voff");
    }
}