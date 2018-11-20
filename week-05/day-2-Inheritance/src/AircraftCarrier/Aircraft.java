package AircraftCarrier;
/*Create a class that represents an aircraft
    There are 2 types of aircrafts: F16 and F35
    Both aircraft should track how many ammo it has
    Methods:
    - fight
        --It should use all the ammos (set it to 0) and it should return the damage it deals
        --The damage is the multiplication of the base damage and the ammos
    - refill
        -- It should take a number as parameter and substract as much ammo as possibe
        --- It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter          or the max ammo of the aircraft)
        It should return the remaining ammo
        Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288*

     - getType : It should return it's type as a string
     - getStatus: It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
     - isPriority: It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16*/

public class Aircraft {
  String type = "";
  int ammo = 0;
  int maxAmmo = 0;
  int baseDamage = 0;
  int totalDamage = 0;
  boolean isPriority = true;

  public void getTotalDamage(int totalDamage, int damage) {
    this.totalDamage+= damage;
  }

  public int fight() {
    int damage = this.baseDamage * this.ammo;
    this.ammo = 0;
    this.getTotalDamage(this.totalDamage, damage);
    return damage;
  }

  public int refill(int number) {
    int difference = this.maxAmmo - this.ammo;
    if (number > difference) {
      this.ammo = this.maxAmmo;
      return number-difference;
    } else {
      this.ammo += number;
      return 0;
    }
  }

  public String getType() {
    return this.type;
  }

  public String getStatus() {
    return "Type " + getType() + " , Ammo: " + this.ammo + ", Base Damage: " + baseDamage + ", All Damage: " + totalDamage;
  }
}


