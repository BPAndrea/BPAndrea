package Animal_Farm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

  @Test
  public void eatTest() {
    Animal test = new Animal();
    test.eat();
    assertEquals(48, test.eat());
  }
}
