import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem {
    public static void main(String[] args) {
        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"

        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
        System.out.println(putSaturn(planetList));
    }

    public static ArrayList putSaturn(ArrayList input) {
        input.add(5, "Saturn");
        return input;
    }
}




