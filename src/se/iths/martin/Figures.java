package se.iths.martin;

public class Figures {

    public static final double PI = 3.141592;


    public static void main(String[] args){

        Color color = new Color(255,255,255);

        Car c = new Car( false, color );
        Car c2 = new Car( c );

        Point p = new Point(1.0,1.0);
        Point p2 = new Point(4.0,5.0);

        Point p3 = new Point(p);
        Point p4 = new Point(new double[]{1.0,1.0});


        System.out.println(p.distanceTo(p2));

        Point[] pArray = new Point[]{new Point(1.0,1.0),
                                new Point(2.0,2.0)};

        Point[] clonedArray = pArray.clone();

        System.out.println(  );



//        Rectangle rectangle = new Rectangle();
//        //Rectangle rectangle2 = new Rectangle();
//
//        rectangle.setWidth(10);
//        rectangle.setHeight(20);
//
//
//        System.out.println(rectangle.calculateBoxVolume(10,false));
//
//        rectangle2.setHeight(5);
//        rectangle2.setWidth(4);
//
//        Rectangle[] rectArray = new Rectangle[3];
//
//        //rectArray[0] = new Rectangle();
//        rectArray[0] = rectangle;
//        rectArray[0].setWidth(100);
//        rectArray[0].setHeight(200);
//
//
//        System.out.println(rectangle.getWidth());
//        System.out.println(rectangle2.getWidth());
//
//        System.out.println("Color:" + rectangle.getColor());
    }
}
