package Zoo;

/*We are going to represent a Zoo. The animals are cuter than humans, so let's focus on them right now.
    So we need an abstract Animal class
      - it has name, age field
        it has getName() and breed() methods
    Have we got all fields and methods we should? What about gender? Any other? Write down at least 3 fields and/or methods that should be included in Animal.*/
abstract public class Animal {
  String name;
  int age;
  String gender;
  String originalFrom;
  int numberOfLegs;


  public String getName() {
    return name;
  }

  abstract String breed();

  abstract public void eat();
}
