package at.ran.oo.demo.enumeration;

public class Door {
    private DoorStatus status;
    public enum DoorStatus{
        OPEN,
        IN_MOVE,
        CLOSE
    }

    public Door() {
        this.status = DoorStatus.OPEN;
    }

    public void move(DoorStatus newStatus){
        this.status = newStatus;
    }
}
