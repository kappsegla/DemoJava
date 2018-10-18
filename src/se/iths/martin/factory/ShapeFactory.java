package se.iths.martin.factory;

import ovning3oop.Ellipse;
import ovning3oop.Shape;
import se.iths.martin.Color;

import java.util.HashMap;

public class ShapeFactory {

    //Uses a special object to send in parameters
    public static Shape createShape(ShapeParameters info) {
        if (info.type.equals("ellipse"))
            return new Ellipse(info.width, info.height);
        return null;
    }

    //Uses hashmap to send in parameters
    public static Shape createShape(HashMap<String,Object> info) {
        if( info.containsKey("type")) {
            String type = (String)info.get("type");
            return new Ellipse((Double)info.get("width"), (Double)info.get("height"));
        }
        return null;
    }
}
