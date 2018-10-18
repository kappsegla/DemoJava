package se.iths.martin.factory;

import ovning3oop.Ellipse;
import ovning3oop.Shape;
import se.iths.martin.Color;

public class ShapeFactory {

    public static Shape createShape(ShapeParameters info) {
        if (info.type.equals("ellipse"))
            return new Ellipse(info.width, info.height);
        return null;
    }
}
