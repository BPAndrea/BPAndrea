package GardenApplication;
/*The Flower
    needs water if its current water amount is less then 5
    when watering it the flower can only absorb the 75% of the water
    eg. watering with 10 the flower's amount of water should only increase with 7.5
 The Tree
   needs water if its current water amount is less then 10
    when watering it the tree can only absorb the 40% of the water
    eg. watering with 10 the tree's amount of water should only increase with 4*/

public class GardenItem {
  String type;
  String color;
  double waterLevel;
  double absorbation;
  double waterNeeded;
  boolean waterCheck;

  GardenItem() {
    this.color = "";
    this.type = "x";
    this.waterLevel = 0;
    this.absorbation = 0;
    this.waterNeeded = 0;
  }

  public boolean watercheck() {
    return (this.waterLevel < this.waterNeeded);
  }

  public void watering(int waterAmount) {
    if (this.type.equalsIgnoreCase("Flower") && this.watercheck()) {
      this.waterLevel += waterAmount * 0.75;
    } else if (this.type.equalsIgnoreCase("Tree") && (this.watercheck())) {
      this.waterLevel += waterAmount * 0.4;
    }
  }


 public void info() {
    if (this.watercheck()) {
      System.out.println("The " + this.color + " " + this.type + " needs water.");
    } else {
      System.out.println("The " + this.color + " " + this.type + " doesn't need water.");
    }
  }

}
