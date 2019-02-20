import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Duplicated_chars {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        Path filePath = Paths.get("assets/doubled-text.txt");

        try {
            List<String> duplicatedText = Files.readAllLines(filePath);
            //System.out.println(duplicatedText.get(0).charAt(0));

            System.out.println(duplicatedText.get(0).length());

            String simpleText = "";
            for (int i = 0; i < duplicatedText.size(); i++) {
                for (int j = 0; j < (duplicatedText.get(i).length()); j+=2) {
                   // if (j % 2 != 0) {
                        simpleText += duplicatedText.get(i).charAt(j);
                        //String new=duplicatedText.remove(0).charAt(j);
                    //}
                }
                simpleText+="\n";
            }
            System.out.println(simpleText);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
