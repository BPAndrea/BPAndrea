package AircraftCarrier;
  /*Max ammo: 8
    Base damage: 30*/

public class F16 extends Aircraft {
  F16() {
    super();
    this.type = "F16";
    this.maxAmmo = 8;
    this.baseDamage =30;
    this.isPriority = false;
  }
}
