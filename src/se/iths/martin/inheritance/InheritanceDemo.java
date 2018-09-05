package se.iths.martin.inheritance;

import java.util.Scanner;

public class InheritanceDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cylinder cylinder = new Cylinder(1.0f, 2.0f);
        //Cylinder can be a circle
        Circle circle = cylinder;
        //Circle can be an object
        Object object = circle;
        //Cylinder can be object too
        Object object2 = cylinder;

        //Check type before trying to cast
        if (object.getClass() == Cylinder.class)
            //Cast object to original type
            ((Cylinder) object).getRadius();


        System.out.println("Cylinder height = " + cylinder.getHeight()
                + " Cylinder radius = " + cylinder.getRadius());


        System.out.println("Hello!");
    }
}
