package thingComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Thing milk = new Thing("Get milk");
    Thing obstacles = new Thing("Remove the obstacles");
    Thing standUp = new Thing("Stand up");
    Thing eatLunch = new Thing("Eat lunch");
    standUp.complete();
    eatLunch.complete();

    List<Thing> test = new ArrayList<>();
    test.add(milk);
    test.add(obstacles);
    test.add(standUp);
    test.add(eatLunch);
    Collections.sort(test);
    for (Thing item : test) {
      System.out.println(item);
    }
  }
}
