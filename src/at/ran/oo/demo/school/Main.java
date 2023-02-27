package at.ran.oo.demo.school;

import java.util.Date;

public class Main
{
    public static void main(String[] args) {
        Student s1 = new Student("hans","müller", new Date(),3);
        Student s2 = new Student("sepp","maier", new Date(),4);

        SchoolClass sc = new SchoolClass("3cWI");
        sc.addStudent(s1);
        sc.addStudent(s2);

        sc.printStudents();
        System.out.println(sc.getOverallMissingHours());

    }
}
