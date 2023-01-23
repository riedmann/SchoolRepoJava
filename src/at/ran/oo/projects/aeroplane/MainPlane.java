package at.ran.oo.projects.aeroplane;

import java.util.List;

public class MainPlane {
    public static void main(String[] args) {
        Aeroplane plane = new Aeroplane(40, 5000, 10);
        Engine e1 = new Engine(80000);
        Engine e2 = new Engine(90000);

        plane.addEngine(e1);
        plane.addEngine(e2);

        for (int i = 0; i < plane.getEngines().size(); i++) {
            System.out.println(plane.getEngines().get(i).getHorsePower());
        }

        for (Engine engine: plane.getEngines()) {
            System.out.println(engine.getHorsePower());
        }
    }
}
