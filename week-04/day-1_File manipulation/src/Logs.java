import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.
        Path filePath = Paths.get("assets/log.txt");
        try {
            List<String> logList = Files.readAllLines(filePath);
            //Writes all the date within the logList Arraylist:  System.out.println(logList.toString());

           for (int i = 0; i < logList.size(); i++) {
                System.out.println(logList.get(i).substring(27, 38));
            }
           /*List<String> newList=new ArrayList<>();
           Files.lines(filePath)
                    .forEach(output -> System.out.println(output.substring(27, 38)));
            Files.lines(filePath)
                    .filter(output2 -> (output2.endsWith("GET /")))
                    .forEach(output3 ->newList.add(output3));
            System.out.println(newList.size());*/




            //System.out.println(logList.get(0).substring(27, 38));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public static ArrayList<String> ipAddresses(ArrayList<String> input) {
        ArrayList<String> toReturn = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            toReturn.add(input.get(5));
        }
        return toReturn;
    }*/
}
