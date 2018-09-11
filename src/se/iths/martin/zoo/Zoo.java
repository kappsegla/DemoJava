package se.iths.martin.zoo;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.talk();
        cat.talk();

        Mammal mammal = cat;
        mammal.talk();
    }
}


