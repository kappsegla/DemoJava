package se.iths.martin;

public class Color {
    private int redcolor;
    private int greencolor;
    private int bluecolor;

    public Color(int red, int green, int blue){
        redcolor = red;
        greencolor = green;
        bluecolor = blue;
    }

    public Color(Color color) {
        this.redcolor = color.redcolor;
        this.greencolor = color.greencolor;
        this.bluecolor = color.bluecolor;
    }

    public int getRedcolor() {
        return redcolor;
    }

    public void setRedcolor(int redcolor) {
        this.redcolor = redcolor;
    }

    public int getGreencolor() {
        return greencolor;
    }

    public void setGreencolor(int greencolor) {
        this.greencolor = greencolor;
    }

    public int getBluecolor() {
        return bluecolor;
    }

    public void setBluecolor(int bluecolor) {
        this.bluecolor = bluecolor;
    }
}
