import java.util.ArrayList;
import java.util.Arrays;

public class MatchMaking {
    public static void main(String[] args) {
        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches(ArrayList girls, ArrayList boys) {
        ArrayList<String> listCombined = new ArrayList<>();

        // .get function can be used for Strings only-- this is why you have to cast it
        for (int i = 0; i < girls.size(); i++) {
            listCombined.add((String) girls.get(i));
            listCombined.add((String) boys.get(i));
        }
        return listCombined;
    }

}

