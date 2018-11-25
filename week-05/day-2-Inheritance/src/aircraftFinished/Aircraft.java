package aircraft;
/*
Aircrafts
    Create a class that represents an aircraft
    There are 2 types of aircrafts: F16 and F35
    Both aircraft should track how many ammo it has
    F16
    Max ammo: 8
    Base damage: 30
    --fight
    It should use all the ammos (set it to 0) and it should return the damage it deals
    The damage is the multiplication of the base damage and the ammos
    -- refill
    It should take a number as parameter and substract as much ammo as possibe
    It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter or the max ammo of the     aircraft)
    It should return the remaining ammo
    Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288
    -- getType
    It should return it's type as a string
    --getStatus
    It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
    -- isPriority
    It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16
    */

abstract class Aircraft {
  int currentAmmo;
  int maxAmmo;
  int baseDamage;
  int totalDamage;
  boolean isPriority = false;


  Aircraft() {
    this.currentAmmo = 0;
    this.totalDamage = 0;
  }

  public int fight() {
    int damageDealt = this.currentAmmo * this.baseDamage;
    this.currentAmmo = 0;
    this.totalDamage += damageDealt;
    return damageDealt;
  }

  public int refill(int newAmmo) {
    if (newAmmo > (this.maxAmmo - this.currentAmmo)) {
      int rest = newAmmo - this.maxAmmo + this.currentAmmo;
      this.currentAmmo = this.maxAmmo;
      return rest;
    } else {
      this.currentAmmo += newAmmo;
      return 0;
    }
  }

  public String getType() {
    return this.getClass().getSimpleName();
  }

  public String getStatus() {
    String info = "Type " + this.getClass().getSimpleName() +
        ", Ammo: " + this.currentAmmo +
        ", Base Damage: " + this.baseDamage +
        ", All Damage: " + totalDamage;
    return info;
  }

}


