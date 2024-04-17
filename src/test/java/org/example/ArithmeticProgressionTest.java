package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticProgressionTest {

    @Test
    void getNumber1() {
        ArithmeticProgression example = new ArithmeticProgression(4, 7);
        assertEquals(example.getNumber(9), 60);
    }

    @Test
    void getNumber2() {
        ArithmeticProgression example = new ArithmeticProgression(0, -3);
        assertEquals(example.getNumber(12), -33);
    }

    @Test
    void getNumber3() {
        ArithmeticProgression example = new ArithmeticProgression(4.12, 0.08);
        assertEquals(example.getNumber(5), 4.44);
    }

    @Test
    void getNumber4() {
        ArithmeticProgression example = new ArithmeticProgression(4.12, -0.08);
        assertEquals(example.getNumber(4), 3.88);
    }

    @Test
    void getNumber5() {
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            ArithmeticProgression example = new ArithmeticProgression(2, 0);
            example.getNumber(-5);
        });
        assertEquals("Wrong index", thrown.getMessage());
    }

    @Test
    void summ1() {
        ArithmeticProgression example = new ArithmeticProgression(4, 7);
        assertEquals(example.summ(14), 644);
    }

    @Test
    void summ2() {
        ArithmeticProgression example = new ArithmeticProgression(19, -2);
        assertEquals(example.summ(15), 90);
    }

    @Test
    void summ3() {
        ArithmeticProgression example = new ArithmeticProgression(-7, -2);
        assertEquals(example.summ(15), -300);
    }

    @Test
    void summ4() {
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            ArithmeticProgression example = new ArithmeticProgression(2.12, 0.12);
            example.summ(-5);
        });
        assertEquals("Wrong index", thrown.getMessage());
    }

    @Test
    void summ5() {
        ArithmeticProgression example = new ArithmeticProgression(2.121212121, 0.000000012);
        assertEquals(example.summ(3), 6.363636381000001);
    }
}