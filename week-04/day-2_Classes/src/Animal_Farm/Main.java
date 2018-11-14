package Animal_Farm;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
        /* Animal
         Create an Animal class
         Every animal has a hunger value, which is a whole number
         Every animal has a thirst value, which is a whole number
         when creating a new animal object these values are created with the default 50 value
         Every animal can eat() which decreases their hunger by one
         Every animal can drink() which decreases their thirst by one
         Every animal can play() which increases both by one*/

    Animal cat = new Animal();
    Animal dog = new Animal();

    //Testing Animal methods:
    System.out.println(cat.hunger);
    cat.eat();
    cat.eat();
    cat.eat();
    System.out.println(cat.hunger);
    cat.play();
    dog.play();
    System.out.println(cat.hunger + " " + cat.thirst);

    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(cat);
    animals.add(dog);

    Farm farmInMain = new Farm(animals);
    //Testing breed() and slaughter() method:
    System.out.println(farmInMain.arrayListFarm.size());
    farmInMain.breed();
    System.out.println(farmInMain.arrayListFarm.size());
    for (int i = 0; i < farmInMain.arrayListFarm.size(); i++) {
      System.out.print(farmInMain.arrayListFarm.get(i).hunger + ", ");
    }

    farmInMain.slaughter();
    System.out.println(farmInMain.arrayListFarm.size());
    for (int i = 0; i < farmInMain.arrayListFarm.size(); i++) {
      System.out.print(farmInMain.arrayListFarm.get(i).hunger + ", ");
    }

    farmInMain.slaughter();
    System.out.println(farmInMain.arrayListFarm.size());
    for (int i = 0; i < farmInMain.arrayListFarm.size(); i++) {
      System.out.print(farmInMain.arrayListFarm.get(i).hunger + ", ");
    }
  }
}

