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
    Ship enemyShip = new Ship (pirates);
    //System.out.println("Ship size at initialisation: " +shipInMain.pirates.size());
    //System.out.println("Ship size at initialisation: " +enemyShip.pirates.size());

    shipInMain.fillShip();
    enemyShip.fillShip();
    System.out.println("Ship size after filling: " +shipInMain.pirates.size());
    System.out.println("Enemy's Ship size after filling: " +enemyShip.pirates.size());
    System.out.println("Pirates being alive on ship: "+shipInMain.crewAlive());
    System.out.println("Pirates being alive on ship: "+enemyShip.crewAlive());
    System.out.println(shipInMain.pirates.size());
    System.out.println(enemyShip.pirates.size());
    System.out.println(shipInMain.battle(enemyShip));


    //1. Testing drinkSomeRum, howsIsGoingMate, die:
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


    firstPirate.brawl(secondPirate);
    secondPirate.brawl(firstPirate);
    secondPirate.brawl(thirdPirate);






  }
}
