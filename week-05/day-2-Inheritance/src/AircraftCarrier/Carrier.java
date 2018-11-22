package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

/*Create a class that represents an aircraft-carrier
    The carrier should be able to store aircrafts
    Each carrier should have a store of ammo represented as number
    The inital ammo should be given by a parameter in it's constructor
    The carrier also has a health point given in it's constructor as well

   -- add: It should take a new aircraft and add it to its store
   -- fill: It should fill all the aircraft with ammo and substract the needed ammo from the ammo storage
      If there is not enough ammo than it should start to fill the aircraftis with priority first
      If there is no ammo when this method is called it should throw an exception
fight
It should take another carrier as a refrence parameter and fire all the ammo from the aircrafts to it, than substract all the damage from it's health points
    */
public class Carrier {
  List<Aircraft> aircrafts;
  int ammoStore;
  int healthPoint;

  Carrier(int ammoStore, int healthPoint) {
    this.aircrafts = new ArrayList<>();
    this.ammoStore = ammoStore;
    this.healthPoint = healthPoint;
  }

  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  public int countTotalAmmo(ArrayList<Aircraft> aircrafts) {
    int ammoNeeded = 0;
    for (Aircraft item : aircrafts) {
      ammoNeeded += item.difference;
    }
    return ammoNeeded;
  }

  public void fill(int ammo) {
    int ammoNeeded = countTotalAmmo((ArrayList<Aircraft>) aircrafts);
    if (ammo < ammoNeeded)
      for (int i = 0; i < aircrafts.size(); i++) {
        if (aircrafts.get(i).isPriority) {
          aircrafts.get(i).refill(aircrafts.get(i).difference);
          ammo -= aircrafts.get(i).difference;
        }

      }

      ammoStore-=ammo;
  }
}
