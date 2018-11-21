package Zoo;

import Flyable.Flyable;

public class Bird extends Animal implements Flyable {
  Bird(String name) {
    super();
    this.name = name;
  }


  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public void eat() {

  }

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}
