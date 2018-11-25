package aircraft;
/*The carrier should be able to store aircrafts
    Each carrier should have a store of ammo represented as number
    The inital ammo should be given by a parameter in it's constructor
    The carrier also has a health point given in it's constructor as well
    -- add : It should take a new aircraft and add it to its store
    -- fill:
    It should fill all the aircraft with ammo and substract the needed ammo from the ammo storage
    If there is not enough ammo than it should start to fill the aircraftis with priority first
    If there is no ammo when this method is called it should throw an exception
    -- fight
    It should take another carrier as a refrence parameter and fire all the ammo from the aircrafts to it, than substract all the damage from     it's health points
getStatus
It should give back a string about it's and all of its aircrafts status like:*/

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  List<Aircraft> aircrafts;
  int storeAmmo;
  int healthPoint;
  int overAllDamage;

  public Carrier(int storeAmmo, int healthPoint) {
    aircrafts = new ArrayList<>();
    this.storeAmmo = storeAmmo;
    this.healthPoint = healthPoint;
  }

  public void add(Aircraft aircraftToAdd) {
    aircrafts.add(aircraftToAdd);
  }

  public int ammoNeeded() {
    int ammoNeeded = 0;
    for (Aircraft item : aircrafts) {
      ammoNeeded += (item.maxAmmo - item.currentAmmo);
    }
    return ammoNeeded;
  }


  public void fill(int number) throws Exception {
    int ammoNeeded = ammoNeeded();
    int actualNumber = number;
    if (this.storeAmmo <= 0) {
      throw new Exception("Not enough ammo");
    } else if (ammoNeeded <= actualNumber) {
      this.storeAmmo -= ammoNeeded;
      for (int i = 0; i < aircrafts.size(); i++) {
        actualNumber = aircrafts.get(i).refill(actualNumber);
        System.out.println(actualNumber);
      }
    } else if (ammoNeeded > actualNumber) {
      this.storeAmmo -= actualNumber;
      for (int i = 0; i < aircrafts.size(); i++) {
        if (aircrafts.get(i).isPriority) {
          actualNumber = aircrafts.get(i).refill(actualNumber);
        }
      }
      if (actualNumber > 0) {
        for (Aircraft element : aircrafts) {
          if (!element.isPriority)
            actualNumber = element.refill(actualNumber);
        }
      }
    }
  }

  public void fight(Carrier anotherCarrier) {
    int fightAmmo = 0;
    for (Aircraft item : aircrafts) {
      fightAmmo += item.fight();
    }
    anotherCarrier.healthPoint -= fightAmmo;
    this.overAllDamage += fightAmmo;
  }

  public String getStatus() {
    if (this.healthPoint == 0)
      return "It's dead Jim :(";
    else {
      String status = "HP: " + this.healthPoint +
          ", Aircraft count: " + aircrafts.size() +
          ", Ammo Storage: " + this.storeAmmo +
          ", Total damage: " + this.overAllDamage + "\n" +
          "Aircrafts: \n";
      for (Aircraft item : aircrafts) {
        status += item.getStatus();
        status += System.lineSeparator();
      }
      return status;
    }
  }
}

