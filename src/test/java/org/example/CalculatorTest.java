package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testSum() {
        assertEquals(5, calculator.sum(2,3));
    }

    @Test
    void testFactorial0() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testFactorial1() {
        assertEquals(1, calculator.factorial(1));
    }

    @Test
    void testFactorial5() {
        assertEquals(120, calculator.factorial(5));
    }
}
