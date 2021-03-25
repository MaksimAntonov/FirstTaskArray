package test.epam.learn.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.epam.learn.entity.CustomArray;

import by.epam.learn.service.CalculateCustomArray;

public class CalculateCustomArrayTest {
    private CustomArray Array;
    private CalculateCustomArray CalculateCustomArray;

    @BeforeClass
    public void setUp() {
        Array = new CustomArray(new int[] {1, 5, 4, 2, 5, -4, 8, 5});
        CalculateCustomArray = new CalculateCustomArray();
    }

    @AfterClass
    public void clearData() {
        Array = null;
        CalculateCustomArray = null;
    }

    @Test
    public void testSummary() {
        int actual = CalculateCustomArray.summary(Array);
        int expected = 26;

        assertEquals(actual, expected, actual + " is not equal to " + expected);
    }

    @Test
    public void testAverage() {
        double actual = CalculateCustomArray.average(Array);
        double expected = 3.25;

        assertEquals(actual, expected);
    }

    @Test
    public void testCountsOfPositiveElements() {
        int actual = CalculateCustomArray.countsOfPositiveElements(Array);
        int expected = 7;

        assertEquals(actual, expected);
    }

    @Test
    public void testCountsOfNegativeElements() {
        int actual = CalculateCustomArray.countsOfNegativeElements(Array);
        int expected = 1;

        assertEquals(actual, expected);
    }
}
