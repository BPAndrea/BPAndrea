package com.company.PirateGame;
/*
Create a Pirate class. While you can add other fields and methods, you must have these methods:-

    drinkSomeRum() - intoxicates the Pirate some
    howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
    0 to 4 times, "Pour me anudder!"
    else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
    If you manage to get this far, then you can try to do the following.

    die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
    brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies
    or they both pass out.
    And... if you get that far...

    Add a parrot.
*/

public class Pirate {
  int consumedRum = (int)(Math.random()*5);
  boolean passOut = false;
  boolean isAlive = true;

  public void drinkSomeRum() {
    if(isAlive)
    consumedRum++;
    else
      System.out.println("He's dead, can't drink anymore.");
  }

  public void howsItGoingMate() {
    if (isAlive) {
      if (consumedRum <= 4) {
        System.out.println("Pour me anudder!");
        consumedRum++;
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        passOut = true;
      }
    } else {
      System.out.println("He's dead mate!");
    }
  }

  public void die() {
    isAlive = false;
  }

  public void brawl(Pirate anotherPirate) {
    if(!isAlive) {
      System.out.println("He's dead, he can't brawl anymore!");
    } else if(!anotherPirate.isAlive) {
      System.out.println("Other Pirate is dead, he can't brawl anymore!");
    } else {
      int chance = (int) (Math.random()*3);
      if (chance == 1) {
        die();
        System.out.println("You are dead. Enemy pirate won.");
      } else if (chance == 2) {
        anotherPirate.die();
        System.out.println("Enemy pirate is dead. You won.");
      } else {
        anotherPirate.passOut = true;
        passOut = true;
        System.out.println("They both passed out.");
      }
    }
  }
  //brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies
  //or they both pass out.
}
