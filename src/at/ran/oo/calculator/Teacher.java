package at.ran.oo.calculator;

public class Teacher {
    private String name;
    private int age;


    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void teach(){
        System.out.println("I am teaching");
    }

    public void talk(){
        System.out.println(this.name + " is talking");
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
