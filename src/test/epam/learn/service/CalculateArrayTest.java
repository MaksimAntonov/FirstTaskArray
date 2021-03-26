package test.epam.learn.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.epam.learn.entity.CustomArray;
import by.epam.learn.exception.CustomExeption;

import by.epam.learn.service.CalculateArray;

public class CalculateArrayTest {
    private CustomArray Array;
    private CalculateArray CalculateArray;

    @BeforeClass
    public void setUp() {
        Array = new CustomArray(new int[] {1, 5, 4, 2, 5, -4, 8, 5});
        CalculateArray = new CalculateArray();
    }

    @AfterClass
    public void clearData() {
        Array = null;
        CalculateArray = null;
    }

    @Test
    public void testSummary() throws CustomExeption {
        int actual = CalculateArray.summary(Array);
        int expected = 26;

        assertEquals(actual, expected);
    }

    @Test
    public void testAverage() throws CustomExeption {
        double actual = CalculateArray.average(Array);
        double expected = 3.25;

        assertEquals(actual, expected);
    }

    @Test
    public void testCountsOfPositiveElements() throws CustomExeption {
        int actual = CalculateArray.countsOfPositiveElements(Array);
        int expected = 7;

        assertEquals(actual, expected);
    }

    @Test
    public void testCountsOfNegativeElements() throws CustomExeption {
        int actual = CalculateArray.countsOfNegativeElements(Array);
        int expected = 1;

        assertEquals(actual, expected);
    }
}
