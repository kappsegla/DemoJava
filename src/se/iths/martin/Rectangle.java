package se.iths.martin;

public class Rectangle {
    //Fields for storing information about the Rectangle
    //Private so can only be accessed from code within this class.
    private int height;
    private int width;
    private int color;

    //Getter for calculated Area,no backing field, no setter, Read-only
    public int getArea() {
        return getWidth() * getHeight();
    }

    //Getter for boolean values are called is
    public boolean isSquare() {
        return getWidth() == getHeight();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0)
            this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public double calculateBoxVolume(int boxHeight){

        return getArea() * boxHeight;
    }

    public double calculateBoxVolume(int boxHeight, boolean onlyForSquare){

        if( onlyForSquare && isSquare() || !onlyForSquare)
            return getArea() * boxHeight;
        else
            return 0.0;
    }

    public double calculateBoxVolume(double boxHeight){

        return getArea() * boxHeight;
    }

}
