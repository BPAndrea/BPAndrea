package Pirates;
/*Create a Ship class.
    - The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
    - When a ship is created it doesn't have a crew or a captain.
    - The ship can be filled with pirates and a captain via fillShip() method.
      Filling the ship with a captain and random number of pirates.
      Ships should be represented in a nice way on command line including information about
      captains consumed rum, state (passed out / died)
      number of alive pirates in the crew

    - Ships should have a method to battle other ships: ship.battle(otherShip)
    should return true if the actual ship (this) wins
    the ship should win if its calculated score is higher
    calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
    The loser crew has a random number of losses (deaths).
    The winner captain and crew has a party, including a random number of rum :)*/

import java.util.ArrayList;

public class Ship {
  ArrayList<Pirate> pirates;
  int crewAlive = (int) (Math.random() * 25);


  Pirate captain = new Pirate();


  Ship(ArrayList<Pirate> crew) {
    this.pirates = crew;
  }

  public void fillShip() {
    pirates.add(captain);
    for (int i = 0; i < this.crewAlive; i++) {
      pirates.add(new Pirate());
    }
    shipInfo();
  }

  public void shipInfo() {
    System.out.println("Some info about the ship: The captain consumed " + captain.consumedRum + " rum.");
    if (captain.isAlive)
      System.out.println("The captain is alive.");
    else
      System.out.println("The captain is dead.");
    System.out.println("The number of alive pirates in the crew:  " + (this.crewAlive-1));
  }

/*  public int crewAlive() {
    int numberAlive = 0;
    for (int i = 0; i < pirates.size(); i++) {
      if (pirates.get(i).isAlive)
        numberAlive++;
    }
    return numberAlive;
  }*/

  public boolean battle(Ship otherShip) {
    boolean win = false;
    int losses = (int) (1+(Math.random() * 10));

    if ((this.crewAlive - this.captain.consumedRum) > (otherShip.crewAlive - otherShip.captain.consumedRum)) {
      if (losses >= this.pirates.size()) {
        losses = this.pirates.size()-1;
      }
      for (int i = 0; i < losses; i++) {
        otherShip.pirates.remove(i);

      }
      System.out.println("Your ship won the battle. The enemy lost " +losses+ " pirates.");
      return win = true;
    } else {
      if (losses > otherShip.pirates.size()) {
        losses = otherShip.pirates.size();
      }
      for (int i = 0; i < losses; i++) {
        this.pirates.remove(i);
      }
      System.out.println("The enemy ship won the battle. You lost " +losses+ " pirates.");
      return win = false;
    }
  }
}





