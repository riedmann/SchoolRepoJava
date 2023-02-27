package at.ran.oo.demo.dogs;

import at.ran.oo.demo.dogs.barkstrategies.BarkStrategy;

public abstract class AbstractDog implements Dog{
    protected String name;
    private int age;

    protected BarkStrategy strategy;

    public AbstractDog(String name, int age, BarkStrategy strategy) {
        this.name = name;
        this.age = age;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
