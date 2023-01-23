package at.ran.oo.designpatterns.strategy;

import at.ran.oo.designpatterns.strategy.movements.MoveStrategy;

public class HTLCircle implements Actor {
    MoveStrategy strategy;

    public HTLCircle(MoveStrategy strategy) {
        this.strategy = strategy;
    }

    public MoveStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(MoveStrategy strategy) {
        this.strategy = strategy;
    }

    public void update(){
        strategy.update();
    }

    @Override
    public void render() {
        System.out.println("Circle render");
    }

    public void doA(){

    }

    public void doB(){

    }
}
