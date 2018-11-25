package GardenApplication;
/*needs water if its current water amount is less then 10
    when watering it the tree can only absorb the 40% of the water
    eg. watering with 10 the tree's amount of water should only increase with 4*/

public class Tree extends GardenItem{

  Tree(String color) {
    super();
    this.color = color;
    this.type = "Tree";
    this.absorbation = 0.4;
    this.needsWater = 10.;
  }
}


