package at.ran.oo.school;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private List<Student> students;
    private String name;

    public SchoolClass(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void printStudents(){
        for (Student student: this.students) {
            student.handsUp();
        }
    }

    public int getOverallMissingHours(){
        int sumOfMissingHours = 0;
        for (Student student: this.students) {
            sumOfMissingHours +=student.getAmountOfMissingHours();
        }
        return sumOfMissingHours;
    }
}
