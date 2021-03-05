package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceJUnit4Test {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnWithZero(){
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnHalf(){
        int actual = service.remain(500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZero(){
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOne(){
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

}