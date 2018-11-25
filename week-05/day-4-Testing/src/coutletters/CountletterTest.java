package coutletters;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountletterTest {
  @Test
  public void countletterTest() {
    Countletter myLetter = new Countletter();
    Map<Character, Integer> tmap = new HashMap<>();
    String input = "balAton";
    tmap = myLetter.countletters(input);
    assertEquals(2, (int) tmap.get('a'));
    assertEquals(1, (int) tmap.get('n'));
    assertEquals(1, (int) tmap.get('l'));
  }

}
