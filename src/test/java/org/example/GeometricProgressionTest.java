package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometricProgressionTest {

    @Test
    void getNumber1() {
        GeometricProgression example = new GeometricProgression(4, 7);
        assertEquals(example.getNumber(3), 196);
    }

    @Test
    void getNumber2() {
        GeometricProgression example = new GeometricProgression(1, -3);
        assertEquals(example.getNumber(4), -27);
    }

    @Test
    void getNumber3() {
        GeometricProgression example = new GeometricProgression(4.12, 0.8);
        assertEquals(example.getNumber(2), 3.2960000000000003);
    }

    @Test
    void getNumber4() {
        GeometricProgression example = new GeometricProgression(4.12, -0.8);
        assertEquals(example.getNumber(4), -2.1094400000000006);
    }

    @Test
    void getNumber5() {
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            GeometricProgression example = new GeometricProgression(2, 0);
            example.summ(-5);
        });
        assertEquals("Wrong index", thrown.getMessage());
    }

    @Test
    void summ1() {
        GeometricProgression example = new GeometricProgression(4, 7);
        assertEquals(example.summ(3), 192);
    }

    @Test
    void summ2() {
        GeometricProgression example = new GeometricProgression(19, -2);
        assertEquals(example.summ(5), 95);
    }

    @Test
    void summ3() {
        GeometricProgression example = new GeometricProgression(-7, -2);
        assertEquals(example.summ(6), 57.75);
    }

    @Test
    void summ4() {
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            GeometricProgression example = new GeometricProgression(2.12, 0.12);
            example.summ(-5);
        });
        assertEquals("Wrong index", thrown.getMessage());
    }

    @Test
    void summ5() {
        GeometricProgression example = new GeometricProgression(2.121212121, 0.12);
        assertEquals(example.summ(3), -2.0906666664576);
    }
}