import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt
      Path path = Paths.get("assets/reversed-order.txt");
      System.out.println(reverse(path));

    }

    public static String reverse(Path text) {
      List<String> textToDecode = new ArrayList<>();
      String decoded = "";
      try {
        textToDecode = Files.readAllLines(text);
      } catch (IOException e) {
        e.printStackTrace();
      }
      for (int i = textToDecode.size()-1; i >= 0; i--) {
        for (int j = 0; j < textToDecode.get(i).length(); j++) {
          decoded += textToDecode.get(i).charAt(j);
        }
        decoded += "\n";
      }

      //System.out.println(decoded);
      return decoded;
    }
  }


