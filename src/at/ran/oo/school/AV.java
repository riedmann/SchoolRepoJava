package at.ran.oo.school;

public class AV extends Teacher{

    public AV(String name, int salary) {
        super(name, salary);
    }

    public void organizeExam(){
        System.out.println("Organizing exam...");
    }

    @Override
    public int getSalary() {
        return (int) (super.getSalary() * 1.1);
    }
}
