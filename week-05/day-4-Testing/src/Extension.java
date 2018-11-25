
import java.util.Arrays;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */


public class Extension {

  public static void main(String[] args) {
    int a;
    System.out.println(a = 5 / 2);

  }

  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c)
      return a;
    else if (c > b && c > a)
      return c;
    else if (c < b && b > a)
      return b;
    else
      return -1;
  }

  int median(List<Integer> pool) {
    if (pool.size() == 1)
      return 1;
    else if (pool.size() == 0)
      return 0;
    else
      return pool.get((pool.size() - 1) / 2);
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'á', 'é', 'í', 'ó', 'ö', 'ő', 'ú', 'ü', 'ű', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i += 2;
        length += 2;
      }
      if (i == teve.length()- 1) {
        if (isVowel(c))
          teve = String.join(c + "v" + c, teve.split("" + c + "v" + c));
      }
         }
    return teve;
  }
}
