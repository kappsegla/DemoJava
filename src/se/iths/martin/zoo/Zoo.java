package se.iths.martin.zoo;

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
    }
}


