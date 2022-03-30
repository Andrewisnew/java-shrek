package com.shrek.task0003;


import com.shrek.task00003.Uniqueness;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class UniquenessTest {
    @Before
    public void setUp() {
    }

    @Test
    public void testDuplicateCounter() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("B");
        list.add("C");
        Uniqueness u = new Uniqueness(list);
        int count = u.duplicateCounter();
        assertEquals(2, count);

    }

    @Test
    public void testDuplicateCounterWithIdenticals() {
        List<String> list = new ArrayList<String>();
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        Uniqueness u = new Uniqueness(list);
        int count = u.duplicateCounter();
        assertEquals(1, count);

    }

    @Test
    public void testDuplicateCounterWithoutIdenticals() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        Uniqueness u = new Uniqueness(list);
        int count = u.duplicateCounter();
        assertEquals(0, count);

    }

    @Test
    public void testDuplicateCheck() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("C");
        Uniqueness u = new Uniqueness(list);
        boolean isDuplicate = u.duplicateCheck();
        assertEquals(true, isDuplicate);
    }

    @Test
    public void testDuplicateCheckWithIdenticals() {
        List<String> list = new ArrayList<String>();
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        list.add("B");
        Uniqueness u = new Uniqueness(list);
        boolean isDuplicate = u.duplicateCheck();
        assertEquals(true, isDuplicate);
    }

    @Test
    public void testDuplicateCheckWithoutDuplicates() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        Uniqueness u = new Uniqueness(list);
        boolean isDuplicate = u.duplicateCheck();
        assertEquals(false, isDuplicate);
    }

    @Test
    public void testDuplicateCheckWithOneLine() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        Uniqueness u = new Uniqueness(list);
        boolean isDuplicate = u.duplicateCheck();
        assertEquals(false, isDuplicate);
    }

    @Test
    public void testNumberOfEachDuplicate() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("C");
        Uniqueness u = new Uniqueness(list);
        int numberOfDuplicate = u.numberOfEachDuplicate().get("B");
        assertEquals(2, numberOfDuplicate);
    }

    @Test
    public void testNumberOfEachDuplicateWithoutIdenticals() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        Uniqueness u = new Uniqueness(list);
        int numberOfDuplicate = u.numberOfEachDuplicate().get("B");
        assertEquals(null, numberOfDuplicate);
    }

    @Test
    public void testNumberOfEachDuplicateWithAllIdenticals() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        Uniqueness u = new Uniqueness(list);
        int numberOfDuplicate = u.numberOfEachDuplicate().get("A");
        assertEquals(6, numberOfDuplicate);
    }

    @Test
    public void test1() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        Uniqueness u = new Uniqueness(list);
        int count = u.duplicateCounter();
        assertEquals(0, count);

    }

    @Test
    public void test2() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        Uniqueness u = new Uniqueness(list);
        int numberOfDuplicate = u.numberOfEachDuplicate().get("A");
        assertEquals(null, numberOfDuplicate);
    }

    @Test
    public void test3() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        Uniqueness u = new Uniqueness(list);
        boolean isDuplicate = u.duplicateCheck();
        assertEquals(false, isDuplicate);
    }
}
