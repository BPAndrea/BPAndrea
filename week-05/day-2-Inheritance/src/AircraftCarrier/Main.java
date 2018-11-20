package AircraftCarrier;
  /*   - getType : It should return it's type as a string
         - getStatus: It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
         - isPriority: It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16*/
public class Main {
  public static void main(String[] args) {
    F16 myF16 = new F16();
    F35 myF35 = new F35();
    //System.out.println(myF16.getType());
    System.out.println(myF16.getStatus());
    //System.out.println(myF16.isPriority);
    //System.out.println(myF35.getType());
    System.out.println(myF35.getStatus());
    //System.out.println(myF35.isPriority);
    myF16.ammo = 6;
    //System.out.println(myF16.getStatus());
   // System.out.println(myF16.refill(10));
    System.out.println(myF16.getStatus());
    System.out.println(myF16.fight());
    System.out.println(myF16.getStatus());
    System.out.println(myF16.refill(10));
    System.out.println(myF16.getStatus());
    System.out.println(myF16.fight());
    System.out.println(myF16.getStatus());
  }
}
