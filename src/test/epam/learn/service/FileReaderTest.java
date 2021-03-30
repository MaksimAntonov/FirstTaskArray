package test.epam.learn.service;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.learn.reader.FileReader;
import by.epam.learn.exception.CustomExeption;

public class FileReaderTest {
    FileReader reader;

    @BeforeClass
    public void setUp() {
        reader = new FileReader();
    }

    @AfterClass
    public void clearData() {
        reader = null;
    }

    @DataProvider(name = "fileReaderTestData")
    public Object[][] fileReaderTestData() {
        return new Object[][]{
                {
                    "array_data.txt",
                    Arrays.asList("1, 3, a1, V,6,2,9", "-1,4,6,8,1,5,9, 2", "-1,4,6,8,2,6,1", "-1,4,6,8,2, 6, 1", "-1,4,6,8,1,5,9,2")
                },
                {
                    "array_data2.txt",
                    Arrays.asList("-1,4,6,8,1,5,9, 2", "-1,4,6,8,2,6,1", "-1,4,6,8,2, 6, 1", "1, 3, a1, V,6,2,9", "-1,4,6,8,1,5,9,2")
                },
        };
    }

    @Test(
        description = "Testing for reading file",
        dataProvider = "fileReaderTestData"
    )
    public void readDataFromFileTest(String filename, List<String> expected) throws CustomExeption {
        List<String> actual = reader.readDataFromFile(filename);
        assertEquals(actual, expected);
    }

    @Test(
        description = "Testing CustomExeption",
        expectedExceptions = CustomExeption.class,
        expectedExceptionsMessageRegExp = "File doesn't exist"
    )
    public void readDataFromFileExceptionTest() throws CustomExeption {
        reader.readDataFromFile("missing.txt");
    }
}
