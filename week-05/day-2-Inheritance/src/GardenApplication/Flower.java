package GardenApplication;
/*The Flower
    needs water if its current water amount is less then 5
    when watering it the flower can only absorb the 75% of the water
    eg. watering with 10 the flower's amount of water should only increase with 7.5*/

public class Flower {
  String color;
  int waterAmount;

  Flower() {
    this.color = "";
    this.waterAmount =0;
  }

  Flower(String color) {
    this.color = color;
  }

}
