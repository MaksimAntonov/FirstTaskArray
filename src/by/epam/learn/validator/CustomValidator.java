package by.epam.learn.validator;

public class CustomValidator {
    private static final String ROW_PATTERN = "^(-?\\d,?)+$";

    public static boolean rowValidator(String str) {
        return str.matches(ROW_PATTERN);
    }
}
