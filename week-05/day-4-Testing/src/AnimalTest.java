import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
  @Test
  public void eatTest() {
    Animal myAnimal = new Animal();
    myAnimal.eat();
    assertEquals(49, myAnimal.hunger);
  }

  @Test
  public void drinkTest() {
    Animal myAnimal = new Animal();
    myAnimal.drink();
    assertEquals(49, myAnimal.thirst);
  }

  @Test
  public void playTest() {
    Animal myAnimal = new Animal();
    myAnimal.play();
    assertEquals(51, myAnimal.thirst);
    assertEquals(51, myAnimal.hunger);
  }

}
