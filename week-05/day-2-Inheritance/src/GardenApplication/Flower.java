package GardenApplication;
/*The Flower
    needs water if its current water amount is less then 5
    when watering it the flower can only absorb the 75% of the water
    eg. watering with 10 the flower's amount of water should only increase with 7.5*/

public class Flower extends GardenItem {

  Flower(String color) {
    super();
    this.type = "Flower";
    this.color = color;
    this.absorbation = 0.75;
    this.waterNeeded = 5;
  }
}
