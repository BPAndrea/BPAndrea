import java.util.ArrayList;
import java.util.Arrays;

public class IsInList {
    public static void main(String[] args) {
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        ArrayList<Integer> searchedNumbers = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
        System.out.println(checkNums(list, searchedNumbers));
    }

    public static boolean checkNums(ArrayList<Integer> input, ArrayList<Integer> input2) {
        return (input.containsAll(input2));
    }

}

