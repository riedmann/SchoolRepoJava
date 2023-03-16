package at.ran.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setUp() {
        this.calc = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {

        double result = calc.add(4,7);
        Assertions.assertEquals(11,result);
    }

    @Test
    void add1() {

        double result = calc.add(-3,3);
        Assertions.assertEquals(0,result);
    }

    @Test
    void subtract() {

        double result = calc.subtract(10,4);
        Assertions.assertEquals(6,result);
    }
}