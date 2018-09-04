package se.iths.martin.inheritance;

import java.util.Scanner;

public class InheritanceDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle circle = new Circle(1.0f);
        Cylinder cylinder = new Cylinder( circle, 2.0f );


        System.out.println("Cylinder height = " + cylinder.getHeight()
                           + " Cylinder radius = " + cylinder.getRadius() );


        System.out.println("Hello!");
    }
}
