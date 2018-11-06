import java.lang.StringBuilder;

public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        //Megoldás Stringbuilder nélkül:
        // System.out.println(quote.indexOf("you"));
        //String fixedQuote= quote.substring(0,20)+ " always takes longer than"+ quote.substring(20, quote.length());

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
     /*   StringBuilder	insert(int offset, String str)
        Inserts the string into this character sequence.*/

        StringBuilder fixedQuote = new StringBuilder(quote);
        String toInsert=" always takes longer than";
        fixedQuote.insert(20,toInsert);
        System.out.println(fixedQuote);
    }
}
