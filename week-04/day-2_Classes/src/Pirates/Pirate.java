package Pirates;

/*Create a Pirate class. While you can add other fields and methods, you must have these methods:-

    - drinkSomeRum() - intoxicates the Pirate some
    - howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
    0 to 4 times, "Pour me anudder!"
    else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
    - die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
    - brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance,
 1 dies, the other dies or they both pass out.*/
public class Pirate {
  int consumedRum = (int)(Math.random() * 10);
  boolean isAlive = true;


  public void drinkSomeRum() {
    consumedRum++;
  }

  public void howsItGoingMate(Pirate pirate) {
    if (isAlive == true) {
      if (pirate.consumedRum >= 0 && pirate.consumedRum <= 4) {
        System.out.println("Pour me annudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      }
    } else {
      System.out.println("He's dead.");
    }
  }

  public boolean die() {
    return isAlive = false;
  }

  public void brawl(Pirate yourPirate, Pirate enemyPirate) {
    if (enemyPirate.isAlive == true && yourPirate.isAlive == true) {
      int chance = (int) (Math.random() * 3);
      switch (chance) {
        case 0:
          yourPirate.die();
          System.out.println("Your pirate is dead. He can't fight.");
          break;
        case 1:
          enemyPirate.die();
          System.out.println("Enemy pirate is dead. He can't fight.");
          break;
        case 2:
          System.out.println("Both pass out.");
          break;
      }
    } else if (!enemyPirate.isAlive && !yourPirate.isAlive) {
      System.out.println("Enemy pirate is dead. He can't fight.");
      System.out.println("Your pirate is dead. He can't fight.");
    } else if (!enemyPirate.isAlive) {
      System.out.println("Enemy pirate is dead. He can't fight.");
    } else if (!yourPirate.isAlive) {
      System.out.println("Your pirate is dead. He can't fight.");
    }
  }
}
