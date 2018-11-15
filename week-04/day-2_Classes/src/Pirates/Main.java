package Pirates;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Pirate firstPirate = new Pirate();
    Pirate secondPirate = new Pirate();
    Pirate thirdPirate = new Pirate();

    Parrot parrotInMain = new Parrot();

    ArrayList<Pirate> pirates = new ArrayList<>();

    Ship shipInMain = new Ship (pirates);
    System.out.println("Ship size at initialisation: " +shipInMain.pirates.size());

    shipInMain.fillShip();


    //Testing drinkSomeRum, howsIsGoingMate, die:
    firstPirate.drinkSomeRum();
    firstPirate.drinkSomeRum();
    firstPirate.drinkSomeRum();
    firstPirate.drinkSomeRum();
    System.out.println(firstPirate.consumedRum);
    firstPirate.howsItGoingMate(firstPirate);
    firstPirate.drinkSomeRum();
    System.out.println(firstPirate.consumedRum);
    firstPirate.howsItGoingMate(firstPirate);
    firstPirate.die();
    firstPirate.howsItGoingMate(firstPirate);


    firstPirate.brawl(firstPirate, secondPirate);
    secondPirate.brawl(secondPirate, firstPirate);
    secondPirate.brawl(secondPirate, thirdPirate);






  }
}
