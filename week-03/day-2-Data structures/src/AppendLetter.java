
import java.util.*;
import java.util.AbstractList;

public class AppendLetter{
    public static void main(String... args){
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.
        // The output should be: "boa", "anaconda", "koala", "panda", "zebra"

        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        //far.add(0,((String)far.get(0)+"a"));
        System.out.println(appendA(far));
    }

    public static List appendA(List input) {
        for (int i = 0; i < input.size(); i++) {
            input.set(i, (input.get(i) + "a"));

        }
        return input;}


}
