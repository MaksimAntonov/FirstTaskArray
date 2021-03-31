package test.epam.learn.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.learn.parser.StringParser;

public class StringParserTest {
    StringParser parser;

    @BeforeClass
    public void setUp() {
        parser = new StringParser();
    }

    @AfterClass
    public void clearData() {
        parser = null;
    }

    @DataProvider(name = "stringParserTestData")
    public Object[][] stringParserTestData() {
        return new Object[][]{
                {
                    "-1,4,6,8,1,5,9, 2",
                    new int[] {-1,4,6,8,1,5,9,2}
                },
                {
                    "-1,4,6,8,2,6,1",
                    new int[] {-1,4,6,8,2,6,1}
                },
                {
                    "-1,4,6,8,2, 6, 1",
                    new int[] {-1,4,6,8,2,6,1}
                },
                {
                    "-1,4,6,8,1,5,9,2",
                    new int[] {-1,4,6,8,1,5,9,2}
                }
        };
    }

    @Test(
        description = "Testing for string parser",
        dataProvider = "stringParserTestData",
        groups = "createarrayfromfile"
    )
    public void parseStringToIntArrayTest(String stringForParsing, int[] expected) {
        int[] actual = parser.parseStringToIntArray(stringForParsing);
        assertEquals(actual, expected);
    }
}
