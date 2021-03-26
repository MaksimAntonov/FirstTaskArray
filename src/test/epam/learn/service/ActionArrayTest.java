package test.epam.learn.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.epam.learn.entity.CustomArray;
import by.epam.learn.exception.CustomExeption;

import by.epam.learn.service.ActionArray;

public class ActionArrayTest {
    private CustomArray Array;
    private ActionArray ActionArray;

    private void recreateArray() {
        Array = new CustomArray(new int[] {1, 5, 4, -2, 5, -4, 8, 5});
    }

    @BeforeClass
    public void setUp() {
        ActionArray = new ActionArray();
        this.recreateArray();
    }

    @AfterClass
    public void clearData() {
        Array = null;
        ActionArray = null;
    }

    @Test
    public void testReplaceByStriclyCondition() throws CustomExeption {
        this.recreateArray();
        int[] actual = ActionArray.replaceByStriclyCondition(Array, 5, 0);
        int[] expected = new int[] {1, 0, 4, -2, 0, -4, 8, 0};

        assertEquals(actual, expected);
    }

    @Test
    public void testReplaceByValueLessCondition() throws CustomExeption {
        this.recreateArray();
        int[] actual = ActionArray.replaceByValueLessCondition(Array, -1, -1);
        int[] expected = new int[] {1, 5, 4, -1, 5, -1, 8, 5};

        assertEquals(actual, expected);
    }

    @Test
    public void testReplaceByValueMoreCondition() throws CustomExeption {
        this.recreateArray();
        int[] actual = ActionArray.replaceByValueMoreCondition(Array, 4, 7);
        int[] expected = new int[] {1, 7, 7, -2, 7, -4, 7, 7};

        assertEquals(actual, expected);
    }
}
