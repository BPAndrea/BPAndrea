package Zoo;

public class Bird extends Animal {
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
}
