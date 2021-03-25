package by.epam.learn.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.learn.entity.CustomArray;

public class ActionArray {
    static Logger Logger = LogManager.getLogger();

    public int[] replaceByStriclyCondition(CustomArray array, int condition, int newValue) {
        Logger.info("Replace by stricly condition: " + condition + ", new value " + newValue);
        int length = array.getLength();
        Logger.info("Old array " + array.toString());
        for (int i = 0; i < length; i++) {
            int element = array.getElement(i);
            if (element == condition) {
                array.setElement(i, newValue);
            }
        }

        int[] newArray = array.getArray();
        Logger.info("New array " + array.toString());
        return newArray; 
    }

    public int[] replaceByValueLessCondition(CustomArray array, int condition, int newValue) {
        Logger.info("Replace by value less than condition: " + condition + ", new value " + newValue);
        int length = array.getLength();
        Logger.info("Old array " + array.toString());
        for (int i = 0; i < length; i++) {
            int element = array.getElement(i);
            if (element <= condition) {
                array.setElement(i, newValue);
            }
        }

        int[] newArray = array.getArray();
        Logger.info("New array " + array.toString());
        return newArray; 
    }

    public int[] replaceByValueMoreCondition(CustomArray array, int condition, int newValue) {
        Logger.info("Replace by value more than condition: " + condition + ", new value " + newValue);
        int length = array.getLength();
        Logger.info("Old array " + array.toString());
        for (int i = 0; i < length; i++) {
            int element = array.getElement(i);
            if (element >= condition) {
                array.setElement(i, newValue);
            }
        }

        int[] newArray = array.getArray();
        Logger.info("New array " + array.toString());
        return newArray; 
    }
}
