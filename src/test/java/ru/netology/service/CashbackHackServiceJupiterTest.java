package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceJupiterTest {
    @Test
    public void shouldRemain() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 5800;
        int actual = cashback.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainWithZeroValue() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 0;
        int actual = cashback.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainWithEqualValue() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainWithBigValue() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 50000;
        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
