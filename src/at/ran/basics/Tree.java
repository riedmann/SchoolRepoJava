package at.ran.basics;

public class Tree   {
    private int size;
    private int color;
    private String something;

    public Tree(int size, int color, String something) {
        this.size = size;
        this.color = color;
        this.something = something;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }
}
