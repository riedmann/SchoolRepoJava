package at.ran.oo.demo.designpatterns.bark1;

import at.ran.oo.demo.designpatterns.bark1.strategies.WufStrategy;

import java.time.LocalDate;
import java.time.Period;

public abstract class AbstractDog implements Dog{
    protected WufStrategy strategy;
    private LocalDate dateOfBirth;

    public AbstractDog(WufStrategy strategy) {
        this.strategy = strategy;
    }

    public void setDateOfBirth(int year, int month, int day){
        LocalDate start = LocalDate.of(1996, 2, 29);

    }

    public int getAge(){
        return Period.between(this.dateOfBirth,  LocalDate.now()).getYears();
    }

    public void setStrategy(WufStrategy strategy){
        this.strategy = strategy;
    }
}
