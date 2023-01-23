package at.ran.oo.designpatterns;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private LocalDate birthDay;

    public Person(int year, int month, int day) {
        this.birthDay =  LocalDate.of(year,month,day);
    }

    public int getAge(){
        return Period.between(birthDay,LocalDate.now()).getYears();
    }


}
