package se.iths.martin;

public class Figures {

    public static void main(String[] args){

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle.setWidth(10);
        rectangle.setHeight(20);

        rectangle2.setHeight(5);
        rectangle2.setWidth(4);

        System.out.println(rectangle.getWidth());
        System.out.println(rectangle2.getWidth());


    }
}
