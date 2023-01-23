package at.ran.test;

import at.ran.devops.Boat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BoatTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void invert() {
        Boat b = new Boat();
        int result = b.invert(7);
        Assertions.assertEquals(-7, result);
    }
}