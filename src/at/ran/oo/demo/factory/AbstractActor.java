package at.ran.oo.demo.factory;

public abstract  class AbstractActor implements Actor{
    protected String name;

    public AbstractActor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
