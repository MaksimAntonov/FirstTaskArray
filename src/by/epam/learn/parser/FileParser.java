package by.epam.learn.parser;

import by.epam.learn.reader.*;
import by.epam.learn.validator.*;
import by.epam.learn.exception.*;

public class FileParser {
    public String parseArrayDataFile() throws CustomExeption {
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
