
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class CountLines {

    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    public static void main(String[] args) {
        String filename = "assets/my-file.txt";

        System.out.println(numberOfLines(filename));
    }

    public static int numberOfLines(String filename) {
        try {
            Path filePath = Paths.get(filename);
            List<String> newList = Files.readAllLines(filePath);
            int numberOfLines = newList.size();
            return numberOfLines;
        } catch (Exception e) {
            return 0;
        }
    }

}
