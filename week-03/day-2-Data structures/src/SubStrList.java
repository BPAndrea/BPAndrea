import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SubStrList {
    public static void main(String[] args) {
        //  Create a function that takes a string and a list of string as a parameter
        //  Returns the index of the string in the list where the first string is part of
        //  Only need to find the first occurence and return the index of that
        //  Returns `-1` if the string is not part any of the strings in the list

        String[] searchArr = new String[]{"this", "is", "what", "I'm", "searching"};
        String word = "ching";

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

