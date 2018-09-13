package ovning3oop;

public class ResizableRectangle extends Rectangle implements Resizable {
    public ResizableRectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void resize(int size) {
        double length = getLength();
        double width = getWidth();
        setLength( length * (size/100.0));
        setWidth( width * (size/100.0));
    }
}
