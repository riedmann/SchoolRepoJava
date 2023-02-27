package at.ran.oo.demo.aeroplane;

import java.awt.*;

public class Aeroplane {
    private int length;
    private int width;
    private Engine engine;
    private Color color;

    public Aeroplane(int length, int width, Color color, Engine engine) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.engine = engine;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
