import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        Path fileName = Paths.get("assets/text-to-write.txt");
        Path newFile = Paths.get("assets/copy-of-the-original-file.txt");

        System.out.println(copyFile(fileName, newFile));
    }

    public static boolean copyFile(Path fileName, Path newFile) {
        boolean isSuccessful = false;

        try {
            List<String> content = Files.readAllLines(fileName);
            Files.write(newFile, content);
            isSuccessful = true;

        } catch (IOException e) {
            isSuccessful=false;
        }
        return isSuccessful;
    }
}



