import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SubStrList {
    public static void main(String[] args) {
        String[] searchArr = new String[]{"this", "is", "what", "I'm", "searching"};
        String word = "chin";
        System.out.println(stringfinder(word, searchArr));
    }

    public static int stringfinder(String word, String[] input) {
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i].contains(word)) {
                index = i;
            } else {
                index = -1;
            }
        }
        return index;}
}

