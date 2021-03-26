package by.epam.learn.parser;

import by.epam.learn.reader.*;
import by.epam.learn.validator.*;

public class FileParser {
    public static void main(String[] args) {
        String data = FileReader.readArrayData();
        String[] listData = data.split("\\|");
        for (int i = 0; i < listData.length; i++) {
            if (CustomValidator.rowValidator(listData[i])) {
                System.out.println(listData[i]);
                break;
            }
        }
    }

    public String parseArrayDataFile() {
        String result = null;
        String data = FileReader.readArrayData();
        String[] listData = data.split("\\|");
        for (int i = 0; i < listData.length; i++) {
            if (CustomValidator.rowValidator(listData[i])) {
                result = listData[i];
                break;
            }
        }

        if (result == null) {}

        return result;
    }
}
