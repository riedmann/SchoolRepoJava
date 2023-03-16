package at.ran.oo.school;

public class Principal extends AV{

    public Principal(String name, int salary) {
        super(name, salary);
    }

    public void printCertificate(){
        System.out.println("Printing...");
    }

    @Override
    public int getSalary() {
        return (int) (super.getSalary() * 1.2);
    }
}
