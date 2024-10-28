package org.uvavalencia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Starting tests...");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("All tests completed.");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void additionTest() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void divideExceptionTest() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void additionNegativeTest() {
        assertEquals(-5, calculator.add(10, -15));
    }
}
