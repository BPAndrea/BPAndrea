import java.util.Arrays;
import java.util.Collections;

public class AdvancedBubble_SortThatList {
    public static void main(String[] args) {

        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        //System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        //System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]

        Integer[] bubble = {34, 12, 24, 9, 5};
        boolean descending = true;
        //Integer[] result = sortThatList(bubble, descending);
        //System.out.println(Arrays.toString(result));

        //1 lépésben a fenti két sor:
        System.out.println(Arrays.toString(sortThatList(bubble, descending)));
    }

    public static Integer[] sortThatList(Integer[] input, boolean descending) {
        //System.out.println(descending);
        if (descending == true) {
            Arrays.sort(input, Collections.reverseOrder());
        } else {
            Arrays.sort(input);
        }
        return input;
    }
}

