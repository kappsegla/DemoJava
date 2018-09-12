package se.iths.martin.streams;

import se.iths.martin.Rectangle;

import java.util.ArrayList;

public class JavaStreams {

    private ArrayList<Point> rectangles = new ArrayList<>();


    public void run()
    {
        initialize(100);

        System.out.println(rectangles.stream()
                .filter(r -> r.getX()>10)
                .count());

    }

    private void initialize(int count){
        for (int i = 0; i < count; i++) {
            rectangles.add(new Point(i,i));
        }
    }


    public static void main(String[] args) {

        new JavaStreams().run();

    }
}


