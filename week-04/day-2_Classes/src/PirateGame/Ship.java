package com.company.PirateGame;
/*Create a Ship class.
    The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
    When a ship is created it doesn't have a crew or a captain.
    The ship can be filled with pirates and a captain via fillShip() method.
       --Filling the ship with a captain and random number of pirates.
    Ships should be represented in a nice way on command line including information about
      -- captains consumed rum, state (passed out / died)
      --number of alive pirates in the crew

    Ships should have a method to battle other ships: ship.battle(otherShip)
      --should return true if the actual ship (this) wins
      --the ship should win if its calculated score is higher
      --calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
      --The loser crew has a random number of losses (deaths).
      --The winner captain and crew has a party, including a random number of rum :)*/

import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> pirates;
  Pirate captain = new Pirate();
  boolean isInGame = true;

  Ship() {
    pirates = new ArrayList<>();
  }

  public void fillShip() {
    pirates.add(captain);
    int crewNumber = (int) (Math.random() * 25);
    for (int i = 0; i < crewNumber; i++) {
      pirates.add(new Pirate());
    }
    shipInfo();
  }

  public int countAlive() {
    int numberAlive = 0;
    for (int i = 0; i < pirates.size(); i++) {
      if (pirates.get(i).isAlive) {
        numberAlive++;
      }
    }
    return numberAlive;
  }

  public void shipInfo() {
    System.out.println("Captain consumed " + captain.consumedRum + " rum.");
    if (captain.isAlive && !captain.passOut) {
      System.out.println("The captain is alive.");
    } else if (captain.isAlive && captain.passOut) {
      System.out.println("The captain passed out.");
    } else {
      System.out.println("The captain died.");
    }
    int crewNumber = countAlive();
    System.out.println("Number of alive pirates in the crew incl. captain: " + crewNumber);
  }

  public boolean battle(Ship otherShip) {
    boolean win;
    int losses = (int) (1 + (Math.random()* 8));
    int partyRum = (int) (1 + Math.random() * 5);
    if ((countAlive() - captain.consumedRum) >= (otherShip.countAlive() - otherShip.captain.consumedRum)) {
      win = true;
      if (otherShip.countAlive() < losses) {
        losses = otherShip.countAlive();
      }
      for (int i = 0; i < losses; i++) {
        otherShip.pirates.get(i).die();
      }
      for (int i = 0; i < pirates.size(); i++) {
        pirates.get(i).consumedRum += partyRum;
      }
      System.out.println("You won, the enemy lost " + losses + " pirates. Every pirate gets " + partyRum + " extra rum!");
    } else {
      if (countAlive() < losses) {
        losses = countAlive();
      }
      for (int i = 0; i < losses; i++) {
        this.pirates.get(i).die();
      }
      for (int i = 0; i < otherShip.pirates.size(); i++) {
        otherShip.pirates.get(i).consumedRum += partyRum;
      }
      System.out.println("The enemy won, you lost " + losses + " pirates. Every enemy pirate gets " + partyRum + " extra rum!");
      win = false;
      isInGame = false;
    }
    return win;
  }
 /*--should return true if the actual ship (this) wins
      --the ship should win if its calculated score is higher
      --calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
      --The loser crew has a random number of losses (deaths).
      --The winner captain and crew has a party, including a random number of rum :)*/

}


