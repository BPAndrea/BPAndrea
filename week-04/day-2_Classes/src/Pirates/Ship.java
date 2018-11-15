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
  Pirate captain = new Pirate();

/*public boolean battle(Ship otherShip) {
  int score=0;
  //this.pirates.

return win;}*/

  Ship(ArrayList<Pirate> crew) {
    this.pirates = crew;
  }

  public void fillShip() {
    pirates.add(captain);
    int crewNumber = (int) (Math.random() * 10);
    for (int i = 0; i < crewNumber - 1; i++) {
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
    System.out.println("The number of alive pirates in the crew:  " + (pirates.size()-1));
  }



}
