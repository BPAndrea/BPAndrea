package Zoo;

public class Mammal extends Animal {

  Mammal(String name){
    super();
    this.name = name;
  }

  @Override
  public String breed() {
    return "pushing miniature versions out.";
  }

  @Override
  public void eat() {

  }
}
