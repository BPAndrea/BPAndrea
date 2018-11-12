

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {

    // Write a program that opens a file called "my-file.txt", then prints
    // each of the lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"
    public static void main(String[] args) {
        try { // Required by Files.readAllLines(filePath);
            // Reads the content from `my-file.txt` in the `assets` folder line by line to a String List
            Path filePath = Paths.get("assets/my-file.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines);              // Prints the whole content of the file
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}