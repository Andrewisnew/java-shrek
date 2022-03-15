package com.shrek.task00002;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Task2Test {
    private Main main;

    @Before
    public void setUp() {
        main = new Main();
    }

    Runner runner1 = new Runner("Elena", 341);
    Runner runner2 = new Runner("Thomas", 273);
    Runner runner3 = new Runner("Hamilton", 278);
    Runner runner4 = new Runner("Suzie", 329);
    Runner runner5 = new Runner("Phil", 445);
    Runner runner6 = new Runner("Matt", 402);
    Runner runner7 = new Runner("Alex", 288);
    Runner runner8 = new Runner("Emma", 275);
    Runner runner9 = new Runner("John", 243);
    Runner runner10 = new Runner("James", 334);
    Runner runner11 = new Runner("Jane", 412);
    Runner runner12 = new Runner("Emily", 393);
    Runner runner13 = new Runner("Daniel", 292);
    Runner runner14 = new Runner("Neda", 343);
    Runner runner15 = new Runner("Aaron", 317);
    Runner runner16 = new Runner("Kate", 265);
    Runner[] runArray = new Runner[]{runner1, runner2, runner3, runner4, runner5, runner6,
            runner7, runner8, runner9, runner10, runner11, runner12, runner13, runner14, runner15, runner16};

    @Test
    public void test1() {
        String winner = main.getWinner(runArray);
        assertEquals("John", winner);
        String second = main.getSecond(runArray);
        assertEquals("Kate", second);
    }

    @Test
    public void test2() {
        Runner[] oneRunner = new Runner[]{runner1};
        String winner = main.getWinner(oneRunner);
        assertEquals("Elena", winner);
        String second = main.getSecond(oneRunner);
        assertNull(second);
    }

    @Test
    public void test3() {
        Runner[] twoRunners = new Runner[]{runner1, runner2};
        String winner = main.getWinner(twoRunners);
        assertEquals("Thomas", winner);
        String second = main.getSecond(twoRunners);
        assertEquals("Elena", second);
    }

    @Test
    public void test4() {
        Runner[] noRunners = null;
        String winner = main.getWinner(noRunners);
        assertNull(winner);
        String second = main.getSecond(noRunners);
        assertNull(second);
    }

    @Test
    public void test6() {
        Runner[] threeRunners = new Runner[]{runner1, runner2, runner3};
        String winner = main.getWinner(threeRunners);
        assertEquals("Thomas", winner);
        String second = main.getSecond(threeRunners);
        assertEquals("Hamilton", second);
    }

    @Test
    public void test7() {
        Runner[] fourRunners = new Runner[]{runner10, runner11, runner12, runner13};
        String winner = main.getWinner(fourRunners);
        assertEquals("Daniel", winner);
        String second = main.getSecond(fourRunners);
        assertEquals("James", second);
    }


}
