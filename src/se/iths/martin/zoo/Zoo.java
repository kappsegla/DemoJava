package se.iths.martin.zoo;

import java.util.ArrayList;

public class Zoo {


    public static void toPet(Pet pet) {
        pet.isCute();
    }

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        Pet pet = new Pet() {
            @Override
            public boolean isCute() {
                return true;
            }
        };

        boolean b = pet.isCute();
        Pet pet1 = new SmallDog();

        toPet(pet1);

        dog.talk();
        cat.talk();

        Mammal mammal = dog;
        mammal.talk();


        //Check if an object is of specific type
        //If true, typecast and call methods.
        //Prefer automatic behaivor with override if possible.
        //Only use if we have a collection of objects where not all
        //have a specific interface implemented.
        if(mammal instanceof Pet)
            ((Pet)mammal).isCute();

    }
}


