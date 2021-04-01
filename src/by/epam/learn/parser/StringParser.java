package by.epam.learn.parser;

import java.util.ArrayList;

public class StringParser {
    private static final String NUMBER_SEPARATOR = ",";

    public int[] parseStringToIntArray(String stringForParsing) {
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        String[] listData = stringForParsing.split(NUMBER_SEPARATOR);
        for (int i = 0; i < listData.length; i++) {
            String listElement = listData[i].trim();
            intArrayList.add(Integer.parseInt(listElement));
        }

        int[] intArray = intArrayList.stream().mapToInt(i -> i).toArray();
        return intArray;
    }
}
