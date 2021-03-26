package by.epam.learn.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileReader {
    static Logger Logger = LogManager.getLogger();

    private static final String ARRAY_DATA_FILE = "src/resourses/array_data.txt";

    public static void main(String[] args) {
        System.out.println(FileReader.readArrayData());
    }

    public static String readArrayData() {
        Logger.info("Start reading a data file.");
        String result = null;
        Path path = Paths.get(ARRAY_DATA_FILE);
        try(Stream<String> streamLines = Files.lines(path)) {
            result = streamLines.collect(Collectors.joining("|"));
            Logger.info("Finish reading a data file.");
        } catch (IOException e) {
            Logger.fatal(e.getStackTrace().toString());
        }
        return result;
    }
}