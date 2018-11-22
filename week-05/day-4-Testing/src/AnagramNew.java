import java.util.Arrays;

public class AnagramNew {

  public AnagramNew() {

  }

   public boolean anagram(String a, String b) {
    boolean isAnagram = false;
    if (a.length() != b.length())
      return isAnagram;
    else {
      a = a.toLowerCase();
      b = b.toLowerCase();
    }

    char aChar[] = a.toCharArray();
    char bChar[] = b.toCharArray();
    Arrays.sort(aChar);
    Arrays.sort(bChar);
    String sortedA = new String(aChar);
    String sortedB = new String(bChar);
    if (sortedA.contentEquals(sortedB))
      isAnagram = true;
    return isAnagram;
  }
}
