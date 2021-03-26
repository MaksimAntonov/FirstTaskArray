package test.epam.learn.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.epam.learn.entity.CustomArray;
import by.epam.learn.exception.CustomExeption;

import by.epam.learn.service.SearchArray;

public class SearchArrayTest {
    CustomArray Array;
    SearchArray SearchArray;

    @BeforeClass
    public void setUp() {
        Array = new CustomArray(new int[] {1, 5, 4, -2, 5, -4, 8, 5});
        SearchArray = new SearchArray();
    }

    @AfterClass
    public void clearData() {
        Array = null;
        SearchArray = null;
    }

    @Test
    public void testSearchMinValue() throws CustomExeption {
        int actual = SearchArray.searchMinValue(Array);
        int expected = -4;

        assertEquals(actual, expected);
    }

    @Test
    public void testSearchMaxValue() throws CustomExeption {
        int actual = SearchArray.searchMaxValue(Array);
        int expected = 8;

        assertEquals(actual, expected);
    }
}
