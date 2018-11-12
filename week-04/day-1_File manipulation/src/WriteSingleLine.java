import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {


    public static void main(String[] args) {
        // Open a file called "my-other-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"

        List<String> myName = new ArrayList();
        try { // Required by Files.write(filePath, content)
        myName.add("Bonnyai-Pap Andrea");
            // Creates a new file if not exists and overwrites it's content
            // The elements of the content lists will become the lines of the file
            Path filePath = Paths.get("assets/my-other-file.txt");
            Files.write(filePath, myName);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-other-file.txt");
        }
    }
}
