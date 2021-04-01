package by.epam.learn.main;

import java.util.List;

import by.epam.learn.creator.CustomArrayCreator;
import by.epam.learn.entity.*;
import by.epam.learn.parser.StringParser;
import by.epam.learn.reader.FileReader;
import by.epam.learn.validator.CustomValidator;
import by.epam.learn.exception.*;

public class Main {
    public static void main(String[] args) {
        CustomArrayCreator creator = new CustomArrayCreator();
        FileReader fr = new FileReader();
        StringParser sp = new StringParser();
        CustomArray ca;

        try {
            List<String> dataList = fr.readDataFromFile("array_data.txt");
            String validLine = null;
            for (String listElement : dataList) {
                if (CustomValidator.rowValidator(listElement)) {
                    validLine = listElement;
                    break;
                }
            }

            int[] intArrayFromLine;
            if (validLine != null) {
                intArrayFromLine = sp.parseStringToIntArray(validLine);
            } else {
                intArrayFromLine = new int[]{};
            }

            ca = creator.createArrayFromIntArray(intArrayFromLine);
            System.out.println(ca.toString());
        } catch (CustomExeption e) {
            System.out.println(e.getMessage());
        }
    }
}
