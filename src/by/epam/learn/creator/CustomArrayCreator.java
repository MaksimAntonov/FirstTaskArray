package by.epam.learn.creator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.learn.entity.CustomArray;
import by.epam.learn.exception.CustomExeption;

public class CustomArrayCreator {
    static Logger Logger = LogManager.getLogger();

    public CustomArray createArrayFromIntArray(int[] intArray) throws CustomExeption {
        if (intArray == null) {
            Logger.error("Creating CustomArray from null");
            throw new CustomExeption("Can't create CustomArray from null");
        }

        CustomArray customArray = new CustomArray(intArray);
        Logger.info("CustomArray was created. Array data: " + customArray.toString());
        return customArray;
    }
}
