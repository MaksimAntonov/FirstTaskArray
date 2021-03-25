package by.epam.learn.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.learn.entity.CustomArray;

public class SearchCustomArray {
    static Logger Logger = LogManager.getLogger();
    
    public int searchMinValue(CustomArray array) {
        Logger.info("Search Min value");
        int min = array.getElement(0);
        int length = array.getLength();
        for (int i = 1; i < length; i++) {
            int element = array.getElement(i);
            if (element < min) {
                min = element;
            }
        }

        Logger.info("Min value is " + min);
        return min;
    }

    public int searchMaxValue(CustomArray array) {
        Logger.info("Search Max value");
        int max = array.getElement(0);
        int length = array.getLength();
        for (int i = 1; i < length; i++) {
            int element = array.getElement(i);
            if (element > max) {
                max = element;
            }
        }

        Logger.info("Max value is " + max);
        return max;
    }
}
