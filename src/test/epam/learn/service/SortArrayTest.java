package test.epam.learn.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.learn.entity.CustomArray;
import by.epam.learn.service.SortArray;

public class SortArrayTest {
    SortArray sa;

    @BeforeClass
    public void setUp() {
        sa = new SortArray();
    }

    @AfterClass
    public void clearData() {
        sa = null;
    }

    @DataProvider(name = "arraySortTestData")
    public Object[][] arraySortTestData() {
        return new Object[][]{
                {new CustomArray(new int[]{1, 6, 11, 4}), new CustomArray(new int[]{1, 4, 6, 11})},
                {new CustomArray(new int[]{5, 0, 4, 5}), new CustomArray(new int[]{0, 4, 5, 5})},
                {new CustomArray(new int[]{2, -6, 65, 5}), new CustomArray(new int[]{-6, 2, 5, 65})},
                {new CustomArray(new int[]{2, -50, 10, 5}), new CustomArray(new int[]{-50, 2, 5, 10})},
                {new CustomArray(new int[]{5, 44, 7, 5, 7, 4, -14, 25, -42, 6}), new CustomArray(new int[]{-42, -14, 4, 5, 5, 6, 7, 7, 25, 44})},
        };
    }

    @Test(dataProvider = "arraySortTestData")
    public void bubbleSortTest(CustomArray actual, CustomArray expected) {
        sa.bubbleSort(actual);
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "arraySortTestData")
    public void quickSortTest(CustomArray actual, CustomArray expected) {
        sa.quickSort(actual);
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "arraySortTestData")
    public void combSortTest(CustomArray actual, CustomArray expected) {
        sa.combSort(actual);
        assertEquals(actual, expected);
    }
}
