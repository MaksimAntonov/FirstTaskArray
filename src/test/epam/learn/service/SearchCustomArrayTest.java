package test.epam.learn.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.epam.learn.entity.CustomArray;

import by.epam.learn.service.SearchCustomArray;

public class SearchCustomArrayTest {
    CustomArray Array;
    SearchCustomArray SearchCustomArray;

    @BeforeClass
    public void setUp() {
        Array = new CustomArray(new int[] {1, 5, 4, -2, 5, -4, 8, 5});
        SearchCustomArray = new SearchCustomArray();
    }

    @AfterClass
    public void clearData() {
        Array = null;
        SearchCustomArray = null;
    }

    @Test
    public void testSearchMinValue() {
        int actual = SearchCustomArray.searchMinValue(Array);
        int expected = -4;

        assertEquals(actual, expected);
    }

    @Test
    public void testSearchMaxValue() {
        int actual = SearchCustomArray.searchMaxValue(Array);
        int expected = 8;

        assertEquals(actual, expected);
    }
}
