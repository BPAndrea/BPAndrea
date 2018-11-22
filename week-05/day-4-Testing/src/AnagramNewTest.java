import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramNewTest {
  @Test
  public void anagramTest() {
    AnagramNew testAnagram = new AnagramNew();
    String first = "AnaGramma";
    String second = "aMMagraNa";
    //assertEquals(true, testAnagram.anagram(first, second));
    assertTrue(testAnagram.anagram(first, second));
  }

  @Test
  public void anagramTest2() {
    AnagramNew testAnagram = new AnagramNew();
    String first = "naGramma";
    String second = "aMMagraNa";
    //assertEquals(false, testAnagram.anagram(first, second));
    assertFalse(testAnagram.anagram(first, second));
  }

  @Test
  public void anagramTest3() {
    AnagramNew testAnagram = new AnagramNew();
    String first = "KnaGramma";
    String second = "aMMagraNa";
    //assertEquals(false, testAnagram.anagram(first, second));
    assertFalse(testAnagram.anagram(first, second));
  }
}
