
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs_IPAddresses {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    Path filePath = Paths.get("assets/log.txt");
    uniqueIPaddresses(filePath);
  }

  public static void uniqueIPaddresses(Path filePath) {
    ArrayList<String> ipAddresses = new ArrayList<>();
    try {
      List<String> logList = Files.readAllLines(filePath);

      for (int i = 0; i < logList.size(); i++) {
        ipAddresses.add(logList.get(i).substring(27, 38));
      }
      System.out.println(ipAddresses.size());

           /* for each solution instead of a simple for loop:
           Files.lines(filePath)
                    .forEach(output -> System.out.println(output.substring(27, 38)));
          */

              /*List<String> newList=new ArrayList<>();
           Files.lines(filePath)
                    .forEach(output -> System.out.println(output.substring(27, 38)));
            Files.lines(filePath)
                    .filter(output2 -> (output2.endsWith("GET /")))
                    .forEach(output3 ->newList.add(output3));
            System.out.println(newList.size());*/
    } catch (IOException e) {
      e.printStackTrace();
    }


    ArrayList<String> uniqueIP = new ArrayList<>();
    for (int i = 0; i < ipAddresses.size(); i++) {
      if (!uniqueIP.contains(ipAddresses.get(i))) {
        uniqueIP.add(ipAddresses.get(i));
      }
    }


    //Solution Nr. 2 with foreach:
    for (String row : ipAddresses) {
      if (!uniqueIP.contains(row)) {
        uniqueIP.add(row);
      }

    }
    System.out.println("Unique IP Addresses: " + uniqueIP);
      System.out.println(uniqueIP.size());
  }
}
