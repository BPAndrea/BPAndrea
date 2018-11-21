package Zoo;

public class Reptile extends Animal {
  Reptile(String name){
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
