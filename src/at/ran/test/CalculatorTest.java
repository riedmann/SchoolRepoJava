package at.ran.test;

import at.ran.devops.Calculator;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("Setup");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("Tear down");
    }

    @org.junit.jupiter.api.Test
    void add() {
        int result = calc.add(4,7);
        Assertions.assertEquals(result, 11);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        int result = calc.multiply(4,7);
        Assertions.assertEquals(result, 28);
    }

    @org.junit.jupiter.api.Test
    void complex() {
        int result = calc.complex(4,7);
        Assertions.assertEquals(result, 11);
    }
}