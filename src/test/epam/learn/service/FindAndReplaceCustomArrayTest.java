package test.epam.learn.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.epam.learn.entity.CustomArray;

import by.epam.learn.service.FindAndReplaceCustomArray;

public class FindAndReplaceCustomArrayTest {
    private CustomArray Array;
    private FindAndReplaceCustomArray FindAndReplaceCustomArray;

    private void recreateArray() {
        Array = new CustomArray(new int[] {1, 5, 4, -2, 5, -4, 8, 5});
    }

    @BeforeClass
    public void setUp() {
        FindAndReplaceCustomArray = new FindAndReplaceCustomArray();
        this.recreateArray();
    }

    @AfterClass
    public void clearData() {
        Array = null;
        FindAndReplaceCustomArray = null;
    }

    @Test
    public void testReplaceByStriclyCondition() {
        this.recreateArray();
        int[] actual = FindAndReplaceCustomArray.replaceByStriclyCondition(Array, 5, 0);
        int[] expected = new int[] {1, 0, 4, -2, 0, -4, 8, 0};

        assertEquals(actual, expected);
    }

    @Test
    public void testReplaceByValueLessCondition() {
        this.recreateArray();
        int[] actual = FindAndReplaceCustomArray.replaceByValueLessCondition(Array, -1, -1);
        int[] expected = new int[] {1, 5, 4, -1, 5, -1, 8, 5};

        assertEquals(actual, expected);
    }

    @Test
    public void testReplaceByValueMoreCondition() {
        this.recreateArray();
        int[] actual = FindAndReplaceCustomArray.replaceByValueMoreCondition(Array, 4, 7);
        int[] expected = new int[] {1, 7, 7, -2, 7, -4, 7, 7};

        assertEquals(actual, expected);
    }
}
