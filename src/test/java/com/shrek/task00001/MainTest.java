package com.shrek.task00001;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MainTest {
    private Main main;

    @Before
    public void setUp() {
        main = new Main();
    }

    @Test
    public void test1() {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        String winner = main.getWinner(names, times);
        assertEquals("John", winner);
        String second = main.getSecond(names, times);
        assertEquals("Kate", second);
    }

    @Test
    public void test2() {
        String[] names = {"Elena"};
        int[] times = {341};
        String winner = main.getWinner(names, times);
        assertEquals("Elena", winner);
        String second = main.getSecond(names, times);
        assertNull(second);
    }

    @Test
    public void test3() {
        String[] names = {"Elena", "Thomas"};
        int[] times = {341, 215};
        String winner = main.getWinner(names, times);
        assertEquals("Thomas", winner);
        String second = main.getSecond(names, times);
        assertEquals("Elena", second);
    }

    @Test
    public void test4() {
        String[] names = {"Elena", "Thomas"};
        int[] times = {141, 215};
        String winner = main.getWinner(names, times);
        assertEquals("Elena", winner);
        String second = main.getSecond(names, times);
        assertEquals("Thomas", second);
    }

    @Test
    public void test5() {
        String[] names = {};
        int[] times = {};
        String winner = main.getWinner(names, times);
        assertNull(winner);
        String second = main.getSecond(names, times);
        assertNull(second);
    }

    @Test
    public void test6() {
        String[] names = {"Elena", "Thomas", "Hamilton"};
        int[] times = {141, 215, 130};
        String winner = main.getWinner(names, times);
        assertEquals("Hamilton", winner);
        String second = main.getSecond(names, times);
        assertEquals("Elena", second);
    }

    @Test
    public void test7() {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie"};
        int[] times = {1, 2, 3, 4};
        String winner = main.getWinner(names, times);
        assertEquals("Elena", winner);
        String second = main.getSecond(names, times);
        assertEquals("Thomas", second);
    }
}
