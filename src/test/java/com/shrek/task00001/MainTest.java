package com.shrek.task00001;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    private Main main;

    @Before
    public void setUp() {
        main = new Main();
    }
    @Test
    public void test1() {
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
        String winner = main.getWinner(names, times);
        assertEquals("John", winner);
    }
}