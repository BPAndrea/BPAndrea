import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        //System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

        //System.out.println(Arrays.toString(input));

        int[] input = {1, 11, 34, 11, 52, 61, 1, 34};
        System.out.println(unique(input));
    }

    public static String unique(int[] input) {
        Arrays.sort(input);
        String toReturn = "";
        for (int i = 0; i < input.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < input.length; j++) {
                if (input[i] == input[j] && i > j) {
                    isUnique = false;
                }
            }
            if (isUnique == true) {
                toReturn += input[i] + ", ";
            }
        }
        return toReturn;
    }
}


