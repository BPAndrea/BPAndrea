import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {
    public static void main(String[] args) {
        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        // Expected output: "What I cannot create I do not understand."

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        quoteSwap(list);
    }

    public static void quoteSwap(ArrayList<String> input) {
        input.add(8, (String) input.get(2));
        input.set(2, (String) input.get(5));
        input.set(5, (String) input.get(8));
        input.remove(8);

        String[] result = new String[input.size()];
        //Important to set ArrayList<String> input- without String it won't be possible to transfer to array, because Java does not know the data
        //type within "result" array.
        result = input.toArray(result);

        for (String x : result)
            System.out.print(x + " ");
    }
}
