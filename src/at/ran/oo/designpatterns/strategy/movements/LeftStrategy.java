package at.ran.oo.designpatterns.strategy.movements;

public class LeftStrategy implements MoveStrategy{
    @Override
    public String getName() {
        return "Left";
    }

    @Override
    public void update() {
        System.out.println("updating left");
    }
}
