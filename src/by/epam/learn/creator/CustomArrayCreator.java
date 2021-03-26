package by.epam.learn.creator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

import by.epam.learn.entity.CustomArray;
import by.epam.learn.parser.FileParser;

public class CustomArrayCreator {
    static Logger Logger = LogManager.getLogger();

    public CustomArray createArray() {
        FileParser fp = new FileParser();
        String dataStr = fp.parseArrayDataFile();
        Logger.info("Data for new Array: " + dataStr);
        String[] dataArr = dataStr.split(",");

        ArrayList<Integer> dataList = new ArrayList<Integer>(dataArr.length);
        for (String elem : dataArr) {
            dataList.add(Integer.parseInt(elem));
        }

        int[] intArray = dataList.stream().mapToInt(i -> i).toArray();
        
        CustomArray ca = new CustomArray(intArray);
        Logger.info("Created Array: " + ca.toString());

        return ca;
    }
}
