package se.iths.martin.factory;

import ovning3oop.Shape;

import java.util.Scanner;

public class Demo {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String format = in.nextLine();

        FileExporter ab = FileExporterFactory.createAlfaBeta(format);
       // ab.saveToFile();

        ShapeParameters sp = new ShapeParameters();
        sp.type = "ellipse";
        sp.height = 100.0;
        sp.width = 100.0;
        Shape shape = ShapeFactory.createShape(sp);

    }
}
