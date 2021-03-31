package test.epam.learn.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.learn.validator.CustomValidator;

public class CustomValidatorTest {
    @DataProvider(name = "rowValidatorPositiveData")
    public Object[][] rowValidatorPositiveData() {
        return new Object[][]{
            {
                "-1,4,6,8,1,5,9,2",
                true
            },
            {
                "-1,4,6,8,2,6,1,7,9,75,87",
                true
            },
            {
                "-1,4,6,8,2,6,1",
                true
            },
            {
                "-1,4,6,75,14,8,1,5,9,2",
                true
            }
        };
    }

    @DataProvider(name = "rowValidatorNegativeData")
    public Object[][] rowValidatorNegativeData() {
        return new Object[][]{
            {
                "-1,4,6a,8,1a,5,9,2",
                false
            },
            {
                "-1,4,6,8,2,6,`1,7,9,75,asfq",
                false
            },
            {
                "-1,4,],8,2,6,1",
                false
            },
            {
                "-1,4,6,75,14,8,1,5d1,2",
                false
            }
        };
    }

    @Test(
        description = "Test for correct strings",
        dataProvider = "rowValidatorPositiveData",
        groups = "createarrayfromfile"
    )
    public void rowValidatorPositiveTest(String rowForValidation, boolean expected) {
        boolean actual = CustomValidator.rowValidator(rowForValidation);
        assertEquals(actual, expected);
    }

    @Test(
        description = "Test for incorrect strings",
        dataProvider = "rowValidatorNegativeData",
        groups = "createarrayfromfile"
    )
    public void rowValidatorNegativeTest(String rowForValidation, boolean expected) {
        boolean actual = CustomValidator.rowValidator(rowForValidation);
        assertEquals(actual, expected);
    }
}
