import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Logs_GET_POST_ratio {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns the GET / POST request ratio.
        Path filePath = Paths.get("assets/log.txt");
        System.out.println("GET/POST ratio: " + getPostRatio(filePath));
    }

    public static double getPostRatio(Path filePath) {
        int getNumber = 0;
        int postNumber = 0;
        try {
            List<String> logList = Files.readAllLines(filePath);
            for (int i = 0; i < logList.size(); i++) {
                if (logList.get(i).endsWith("GET /")) {
                    getNumber++;
                } else if (logList.get(i).endsWith("POST /")) {
                    postNumber++;
                }
            }
/*            Files.lines(filePath)
                    .filter(output2 -> (output2.endsWith("GET /")))
                    .forEach(output3 ->newList.add(output3));*/

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("GET Number: " + getNumber);
        System.out.println("POST Number: " + postNumber);

        return (double)getNumber / postNumber;
    }
}