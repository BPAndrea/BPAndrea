package PetrolStation;
/*Create Station and Car classes
        Station
        - gasAmount
        - refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
        Car
        - gasAmount
        - capacity
        create constructor for Car where:
        initialize gasAmount -> 0
        initialize capacity -> 100*/

public class Station {
  int gasAmount;

  public void refill(Car inputCar) {
    System.out.println("Station's gas amount is currently: " + (gasAmount -= inputCar.capacity));
    System.out.println("Car's gas amount is currently: " + (inputCar.gasAmount += inputCar.capacity));
  }

}
