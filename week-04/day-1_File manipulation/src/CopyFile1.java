import java.io.IOException;
import java.nio.file.*;


import java.io.IOException;
import java.nio.file.Path;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CopyFile1 {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        String fileName = "assets/text-to-write.txt";
        String newFile = "assets/copy-of-the-original-file.txt";

        System.out.println(copyFile(fileName, newFile));
    }

    public static boolean copyFile(String fileName, String newFile) {
        boolean isSuccessful = false;

        try {
            Path content1 = Paths.get(fileName);
            Path content2 = Paths.get(newFile);
            List<String> newContent = Files.readAllLines(content1);
            Files.write(Paths.get(newFile), newContent);
            isSuccessful = true;

        } catch (IOException e) {
            isSuccessful = false;
        }
        return isSuccessful;
    }
}
