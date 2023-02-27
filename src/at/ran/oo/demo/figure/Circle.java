package at.ran.oo.demo.figure;

public class Circle extends Figure{
    private int radius;
    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
}
