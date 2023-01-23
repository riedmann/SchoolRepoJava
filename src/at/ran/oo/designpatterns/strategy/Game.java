package at.ran.oo.designpatterns.strategy;

import at.ran.oo.designpatterns.strategy.movements.LeftStrategy;
import at.ran.oo.designpatterns.strategy.movements.MoveStrategy;
import at.ran.oo.designpatterns.strategy.movements.RightMove;

import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Actor> actors;

    public Game() {
        this.actors = new ArrayList<>();

        MoveStrategy m1 = new RightMove();
        MoveStrategy m2 = new LeftStrategy();

        this.actors.add(new HTLCircle(m1));
        this.actors.add(new HTLCircle(m1));
        this.actors.add(new HTLCircle(m2));

    }

    public void update(){
        for (Actor actor: this.actors) {
           actor.update();
        }


    }

    public void render(){
        for (Actor actor: this.actors) {
            actor.render();
        }
    }
}
