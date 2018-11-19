import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {
  //Create a method that find the 5 most common lottery numbers in lottery.csv

  public static void main(String[] args) {
    Path path = Paths.get("assets/lottery");

  }

  public static void lottery(Path path) {
    List<String> data = new ArrayList<>();
    try {
      data = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    data.subList(37,51);


  }
}
