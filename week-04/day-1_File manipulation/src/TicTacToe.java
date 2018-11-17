import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as a parameter
    // The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
    // Return "X", "O" or "Draw" based on the input file
    Path pathO = Paths.get("assets/win-o.txt");
    Path pathX = Paths.get("assets/win-x.txt");
    Path pathDraw = Paths.get("assets/draw.txt");

   // System.out.println(ticTacResult(pathO));
    // Should print "O"

    //System.out.println(ticTacResult(pathX));
    // Should print "X"

    System.out.println(ticTacResult(pathDraw));
    // Should print "Draw"
  }

  public static String ticTacResult(Path path) {
    int o = 0;
    int x = 0;
    List<String> input = new ArrayList<>();

    try {
      input = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    for (int i = 0; i < input.size(); i++) {
      for (int j = 0; j < input.get(i).length(); j++) {
        if (input.get(i).charAt(j) == 'X')
          x++;
        else
          o++;
      }
    }
    if (x > o)
      return "X";
    else if (x == o)
      return "Draw";
    else
      return "O";
  }

}
