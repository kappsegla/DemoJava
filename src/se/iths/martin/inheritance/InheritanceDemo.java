package se.iths.martin.inheritance;

import java.util.Scanner;

public class InheritanceDemo {

    public static void varArgs(Object... objects){

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].getClass().getSimpleName() + ":" +objects[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        varArgs();
//        varArgs("Hej");
//        varArgs(10,"TextSträng", 20.0, new Cylinder(10.0f, 20f) );
//        varArgs(new Object[]{10,20,30});

  
//
//        Cylinder cylinder = new Cylinder(1.0f, 2.0f);
//        //Cylinder can be a circle
//        Circle circle = cylinder;
//        //Circle can be an object
//        Object object = circle;
//        //Cylinder can be object too
//        Object object2 = cylinder;
//
//        System.out.println( circle );
//
//        //Check type before trying to cast
//        if (object.getClass() == Cylinder.class)
//            //Cast object to original type
//            ((Cylinder) object).getRadius();
//
//
//        System.out.println("Cylinder height = " + cylinder.getHeight()
//                + " Cylinder radius = " + cylinder.getRadius());
//
//
//        System.out.println("Hello!");
    }
}
