import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

  @Test
  public void useTest() {
    Sharpie test = new Sharpie("blue", 2);
    test.use();
    assertEquals(99, test.inkAmount, 5);
// delta value is the maximum difference between the expected and the result
  }

}
