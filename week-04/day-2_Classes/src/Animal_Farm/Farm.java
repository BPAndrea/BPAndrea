package Animal_Farm;

        /*Create a Farm class
        it has list of Animals
                -it has slots which defines the number of free places for animals
                -breed() -> creates a new animal if there's place for it
                -slaughter() -> removes the least hungry animal*/

import java.util.ArrayList;

public class Farm {
  ArrayList<Animal> arrayListFarm;

  private int slots = 5;

  Farm(ArrayList<Animal> arrayListFarm) {
    this.arrayListFarm = arrayListFarm;
  }

  public void breed() {
    if (slots > 0) {
      arrayListFarm.add(new Animal());
      slots--;
    }
  }

  public void slaughter() {
    int index = 0;
    for (int i = 1; i < arrayListFarm.size(); i++) {
      int leastHungry = arrayListFarm.get(0).hunger;
      if (arrayListFarm.get(i).hunger < leastHungry) {
        index = i;
      }
    }
    arrayListFarm.remove(index);
  }

/*  public ArrayList<Animal> arrayListFarm() {
    return arrayListFarm();
  }*/

/*  public ArrayList<Animal> bread() {
    if (slots > 0) {
      //Animal breadAn = new Animal();
      slots--;
      arrayListFarm().add(new Animal());
    }
    return arrayListFarm();
  }*/
}



