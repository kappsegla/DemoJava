package se.iths.martin.collection;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class Storage {
    public static void main(String[] args) {

        //MyStorage<Integer> myStorage = new MyStorage<>();

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arrayList.add(i);
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

        arrayList.forEach((integer) -> System.out.println(integer));


    }

}
