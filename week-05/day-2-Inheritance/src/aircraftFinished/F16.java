package aircraft;
/*
Aircrafts
    Create a class that represents an aircraft
    There are 2 types of aircrafts: F16 and F35
    Both aircraft should track how many ammo it has
    F16
    Max ammo: 8
    Base damage: 30*/

public class F16 extends Aircraft {

  F16() {
    super();
    this.maxAmmo = 8;
    this.baseDamage = 30;
    this.isPriority = false;
  }
}
