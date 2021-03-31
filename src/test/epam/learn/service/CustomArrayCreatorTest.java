package test.epam.learn.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.learn.entity.CustomArray;
import by.epam.learn.exception.CustomExeption;
import by.epam.learn.creator.CustomArrayCreator;

public class CustomArrayCreatorTest {
    CustomArrayCreator creator;

    @BeforeClass
    public void setUp() {
        creator = new CustomArrayCreator();
    }

    @AfterClass
    public void clearData() {
        creator = null;
    }

    @DataProvider(name = "arrayCreatorTestData")
    public Object[][] arrayCreatorTestData() {
        return new Object[][]{
                {
                    new int[] {-1,4,6,8,1,5,9,2},
                    new CustomArray(new int[] {-1,4,6,8,1,5,9,2})
                },
                {
                    new int[] {-1,4,6,8,2,6,1,7,9,75,87},
                    new CustomArray(new int[] {-1,4,6,8,2,6,1,7,9,75,87})
                },
                {
                    new int[] {-1,4,6,8,2,6,1},
                    new CustomArray(new int[] {-1,4,6,8,2,6,1})
                },
                {
                    new int[] {-1,4,6,75,14,8,1,5,9,2},
                    new CustomArray(new int[] {-1,4,6,75,14,8,1,5,9,2})
                }
        };
    }

    @Test(
        description = "Testing for custom array creator",
        dataProvider = "arrayCreatorTestData",
        groups = "createarrayfromfile"
    )
    public void createArrayFromIntArrayTest(int[] intArray, CustomArray expected) throws CustomExeption {
        CustomArray actual = creator.createArrayFromIntArray(intArray);
        assertEquals(actual, expected);
    }

    @Test(
        description = "Test CustomExeption for null",
        expectedExceptions = CustomExeption.class,
        expectedExceptionsMessageRegExp = "Can't create CustomArray from null",
        groups = "createarrayfromfile"
    )
    public void createArrayFromIntArrayExeptionTest() throws CustomExeption {
        creator.createArrayFromIntArray(null);
    }
}
