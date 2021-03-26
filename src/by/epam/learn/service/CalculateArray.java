package by.epam.learn.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.learn.entity.CustomArray;
import by.epam.learn.exception.CustomExeption;

public class CalculateArray {
    static Logger Logger = LogManager.getLogger();

    public int summary(CustomArray array) throws CustomExeption {
        int length = array.getLength();
        int elemSum = 0;
        for (int i = 0; i < length; i++) {
            int element = array.getElement(i);
            elemSum = elemSum + element;
        }

        return elemSum;
    }

    public double average(CustomArray array) throws CustomExeption {
        double length = array.getLength();
        int elemSum = this.summary(array);

        return elemSum / length;
    }

    public int countsOfPositiveElements(CustomArray array) throws CustomExeption {
        int counter = 0;
        int length = array.getLength();
        for (int i = 0; i < length; i++) {
            int element = array.getElement(i);
            if (element > 0) {
                counter++;
            }
        }

        return counter;
    }

    public int countsOfNegativeElements(CustomArray array) throws CustomExeption {
        int counter = 0;
        int length = array.getLength();
        for (int i = 0; i < length; i++) {
            int element = array.getElement(i);
            if (element < 0) {
                counter++;
            }
        }

        return counter;
    }
}
