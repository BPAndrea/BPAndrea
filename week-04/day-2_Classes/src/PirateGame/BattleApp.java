package com.company.PirateGame;

public class BattleApp {
  public static void main(String[] args) {
    Pirate pirate1 = new Pirate();
    Pirate pirate2 = new Pirate();
    Pirate pirate3 = new Pirate();
    Pirate pirate4 = new Pirate();
    Pirate pirate5 = new Pirate();
    Pirate pirate6 = new Pirate();
    Pirate enemy = new Pirate();
    Pirate enemy2 = new Pirate();

    Ship ship = new Ship();
    Ship enemyShip = new Ship();


    //ship.shipInfo();
    //enemyShip.shipInfo();
    ship.fillShip();
    enemyShip.fillShip();
    System.out.println(ship.countAlive());
    System.out.println(enemyShip.countAlive());
    System.out.println(ship.battle(enemyShip));
    //ship.shipInfo();
    //enemyShip.shipInfo();

    /*System.out.println(pirate1.consumedRum);
    System.out.println( pirate1.isAlive);
    pirate1.drinkSomeRum();
    System.out.println(pirate1.consumedRum);
    pirate1.drinkSomeRum();
    pirate1.drinkSomeRum();
    pirate1.howsItGoingMate();
    System.out.println(pirate1.consumedRum);
    pirate1.howsItGoingMate();
    pirate1.howsItGoingMate();
    System.out.println(pirate1.passOut);
    System.out.println(pirate1.isAlive);
    pirate1.die();
    System.out.println(pirate1.isAlive);
    enemy.die();
    pirate1.brawl(enemy);
    enemy.brawl(pirate2);
    pirate2.brawl(enemy);

    pirate2.brawl(enemy2);*/
  }
}
