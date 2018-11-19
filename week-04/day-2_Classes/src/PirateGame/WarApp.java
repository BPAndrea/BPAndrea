package com.company.PirateGame;

public class WarApp {
  public static void main(String[] args) {
    Armada testArmada = new Armada();
    Armada enemyArmada = new Armada();

    System.out.println(testArmada.war(enemyArmada));
  }
}
