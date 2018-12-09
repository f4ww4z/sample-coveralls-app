package com.jagoancoding.samplecoverallsapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void correct_addition() {
        Calculator calculator = new Calculator();
        int sum = calculator.add(2, 3);
        assertEquals(5, sum);
    }
}
