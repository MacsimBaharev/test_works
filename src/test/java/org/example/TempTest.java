package org.example;

import static org.junit.jupiter.api.Assertions.*;

class TempTest {

    @org.junit.jupiter.api.Test
    void summ() {
        Temp temp = new Temp(3, 5);
        assertEquals(temp.summ(), 8);
    }

    @org.junit.jupiter.api.Test
    void multipaly() {
        Temp temp = new Temp(3, 5);
        assertEquals(temp.multiplay(), 15);
    }
}