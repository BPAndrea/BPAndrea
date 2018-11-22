import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  @Test
  public void fibonacciTest() {
    Fibonacci testFibo = new Fibonacci();
    assertEquals(13, testFibo.fibonacci(8));
  }

  @Test
  public void fibonacciTest_negativInputN() {
    Fibonacci testFibo = new Fibonacci();
    assertEquals(-1, testFibo.fibonacci(-5));
  }
}
