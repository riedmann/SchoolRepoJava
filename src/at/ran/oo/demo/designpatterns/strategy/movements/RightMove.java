package at.ran.oo.demo.designpatterns.strategy.movements;

public class RightMove implements MoveStrategy{
    @Override
    public String getName() {
        return "Right";
    }

    @Override
    public void update() {
        System.out.println("Updating right");
    }
}
