package ovning3oop;

public class Program {

    public static final int RECTANGLE = 1;

    enum ShapeType {
        RECTANGLE,
        ELLIPSE,
        RESIZABLE_RECTANGLE
    }


    public Shape createShape(ShapeType type) {
        Shape shape = null;

        if (type == ShapeType.RECTANGLE)
            shape = new Rectangle(0, 0);
        else if(type == ShapeType.ELLIPSE)
            shape = new Ellipse(0,0);
        else if(type == ShapeType.RESIZABLE_RECTANGLE)
            shape = new ResizableRectangle(0,0);

        return shape;
    }

    public void viewShapeInfo(Shape shape) {
        System.out.println(shape);
    }

    public static void main(String[] args) {
        Program program = new Program();

        Shape shape = program.createShape(ShapeType.RECTANGLE);
        Shape shape1 = program.createShape(ShapeType.ELLIPSE);
        Shape shape2 = program.createShape(ShapeType.RESIZABLE_RECTANGLE);

        program.viewShapeInfo(shape);
        program.viewShapeInfo(shape1);

        shape2.setLength(10);
        shape2.setWidth(20);

        if( shape2 instanceof Resizable )
            ((Resizable)shape2).resize(50);
        program.viewShapeInfo(shape2);
    }
}
