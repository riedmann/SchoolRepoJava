package at.ran.oo.demo.school;

import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int amountOfMissingHours;

    public Student(String firstName, String lastName, Date dateOfBirth, int amountOfMissingHours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.amountOfMissingHours = amountOfMissingHours;
    }

    public void handsUp(){
        System.out.println("I am " + lastName + " and my hands are up. I missed " + this.amountOfMissingHours + " hours");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAmountOfMissingHours() {
        return amountOfMissingHours;
    }

    public void setAmountOfMissingHours(int amountOfMissingHours) {
        this.amountOfMissingHours = amountOfMissingHours;
    }
}
