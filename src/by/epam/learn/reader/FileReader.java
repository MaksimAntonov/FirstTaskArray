package by.epam.learn.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.learn.reader.FileReader;
import by.epam.learn.exception.*;

public class FileReader {
    static Logger Logger = LogManager.getLogger();

    private static final String ARRAY_DATA_FILE = "resourses/";
    
    public List<String> readDataFromFile(String filename) throws CustomExeption {
        Logger.info("Reading a data file " + filename);
        List<String> stringList = new ArrayList<String>();
        Path path = Paths.get(ARRAY_DATA_FILE + filename);
        if (!Files.exists(path)) {
            throw new CustomExeption("File doesn't exist");
        }
        
        try(Stream<String> streamLines = Files.lines(path)) {
            Iterator<String> iterator = streamLines.iterator();
            while (iterator.hasNext()) {
                String stringLine = iterator.next();
                stringList.add(stringLine);
            }
            Logger.info("Finish reading a data file.");
        } catch (IOException e) {
            Logger.fatal(e.getStackTrace().toString());
            throw new CustomExeption("Reading file error", e);
        }
        return stringList;
    }
}
