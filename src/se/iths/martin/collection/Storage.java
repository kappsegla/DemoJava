package se.iths.martin.collection;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class Storage {
    public static void main(String[] args) {

        MyStorage<Integer> myStorage = new MyStorage<>();

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arrayList.add(i);
            myStorage.add(i);
            stringArrayList.add("Det här är talet " + i);
        }

        //Print array with for each loop
//        for (Integer i : arrayList) {
//            System.out.println(i);
//        }
        //Print array with forEach method on List that takes an implementation
        //of interface Consumer<T>
//        Consumer<Integer> consumer = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        arrayList.forEach(consumer);

        //      arrayList.forEach((integer) -> System.out.println(integer));
        //      stringArrayList.forEach(text -> System.out.println(text));

        //Lamda implementation of interface
        myStorage.forEach(text -> System.out.println(text));

        //myStorage.forEach(System.out::println);

        //Method reference to static method matching interface method signature
        //myStorage.forEach(Storage::accept);
        //Method reference to instance method matching interface method signature
        //Storage storage = new Storage();
        //myStorage.forEach(storage::method1);
    }

    public static void accept(Integer integer) {
        System.out.println(integer);
    }

    public void method1(Integer integer){
        System.out.println(integer);
    }


}
