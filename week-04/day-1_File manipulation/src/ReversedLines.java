import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  // Create a method that decrypts reversed-lines.txt

  public static void main(String[] args) {
    Path path = Paths.get("assets/reversed-lines.txt");
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
    for (int i = 0; i < textToDecode.size(); i++) {
      for (int j = textToDecode.get(i).length() - 1; j >= 0; j--) {
        decoded += textToDecode.get(i).charAt(j);
      }
      decoded += "\n";
    }

    //System.out.println(decoded);
    return decoded;
  }
}

