package se.iths.martin.factory;

import ovning3oop.Shape;

import java.io.File;
import java.util.List;

public interface FileExporter {
    void saveToFile(File file, List<Shape> shapeList);
}
