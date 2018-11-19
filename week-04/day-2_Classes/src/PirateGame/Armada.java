package com.company.PirateGame;

import java.util.ArrayList;
import java.util.List;

/*Contains Ship-s as a list
    Have a armada.war(otherArmada) method where two armada can engage in war
      -- it should work like merge sort
      -- first ship from the first armada battles the first of the other
    the loser gets skipped so the next ship comes in play from that armada
    whichever armada gets to the end of its ships loses the war
    return true if this is the winner*/
public class Armada {
  List<Ship> ships;

  Armada() {
    this.ships = new ArrayList<>();
    fillArmada();
  }

  public void fillArmada() {
    int randomShip = (int) (2 + Math.random() * 3);
    for (int i = 0; i < randomShip; i++) {
      ships.add(new Ship());
      ships.get(i).fillShip();
    }
    System.out.println("Armada is ready. Number of ships: " + ships.size() + " randomNr. " + randomShip);
  }

  public boolean war(Armada otherArmada) {
    int i = 0;
    int j = 0;
    boolean win;

    while (j < otherArmada.ships.size() && i < ships.size()) {
      if ((otherArmada.ships.get(j).isInGame) && (ships.get(i).isInGame)) {
        if (ships.get(i).battle(otherArmada.ships.get(j))) {
          otherArmada.ships.get(j).isInGame = false;
          System.out.println("Your ship No. " + i + " won. Enemy lost Nr.: " + j);
          System.out.println("Enemy is in game status: " + otherArmada.ships.get(j).isInGame);
          j++;
        } else {
          ships.get(i).isInGame = false;
          System.out.println("Enemy ship No. " + i + " won. Your Ship Nr.: is lost " + i);
          System.out.println("Your in game status: " + ships.get(i).isInGame);
          i++;
        }
      } else if (!(ships.get(i).isInGame)) {
        i++;
      } else if (!otherArmada.ships.get(j).isInGame) {
        j++;
      }
    }
    //Double check:
    int check = 0;
    for (int n = 0; n < ships.size(); n++) {
      if (ships.get(n).isInGame)
        check++;
    }
    System.out.println("Game is over. Your ships in game: " + check);

    int inGame = 0;
    for (int k = 0; k < otherArmada.ships.size(); k++) {
      if (otherArmada.ships.get(k).isInGame)
        inGame++;
    }
    if (inGame == 0) {
      System.out.println("Game is over. Your Armada won. Enemy ships in game: " + inGame);
      return win = true;

    } else {
      System.out.println("Game is over. Enemy Armada won. Enemy ships in game: " + inGame);
      return win = false;
    }
  }
}

