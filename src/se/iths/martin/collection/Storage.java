package se.iths.martin.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Storage {
    public static void main(String[] args) {

        MyStorage<Integer> myStorage = new MyStorage<>();

        for (int i = 0; i < 20; i++) {
            myStorage.add(i);
            System.out.println(myStorage.get(21));
        }

//
//        Scanner sc = new Scanner(System.in);
//
//        int max = Integer.MIN_VALUE;
//        int max2 = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for(int i = 0; i < 5; i++) {
//
//            int tal = sc.nextInt();
//            if (tal > max) {
//                //Save old max into next largest variable
//                max2 = max;
//                max = tal;
//            }
//            if( tal < max && tal > max2)
//            {
//                max2 = tal;
//            }
//            if( tal < min)
//                min = tal;
//
//        }
//        System.out.println(min +" ,"+ max2 + " ,"+max);
    }

    public static void test(Gen<Integer> gen){


    }

    public static void test2(ArrayList<String> list){

    }





}
