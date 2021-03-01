package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldTReturnBoundaryWithZeroAmount() {

        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTReturnSomeBoundary() {

        int actual = service.remain(500);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTReturnFullBoundary() {

        int actual = service.remain(1000);
        int expected = 1000;
        assertEquals(actual, expected);
    }

}