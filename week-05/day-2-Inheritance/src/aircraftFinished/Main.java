package aircraft;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    F16 my16first = new F16();
    F16 my16second = new F16();
    F35 my35first = new F35();
    F35 my35second = new F35();
    Carrier myCarrier = new Carrier(400, 1000);
    Carrier myCarrier1 = new Carrier(40, 2000);
    myCarrier.add(my16first);
    myCarrier.add(my16second);
    myCarrier.add(my35first);
    myCarrier.add(my35second);
    myCarrier.getStatus();
    System.out.println(myCarrier.ammoNeeded());
    try {
      myCarrier.fill(38);
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println(myCarrier.getStatus());
   //myCarrier1.getStatus();
    myCarrier.fight(myCarrier1);
    System.out.println(myCarrier.getStatus());
    System.out.println(myCarrier1.getStatus());

    try {
      myCarrier.fill(23);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(myCarrier.getStatus());
    System.out.println(myCarrier1.getStatus());
    myCarrier.fight(myCarrier1);
    System.out.println(myCarrier.getStatus());
    System.out.println(myCarrier1.getStatus());


/*    System.out.println(my35first.getType());
    System.out.println(my35first.totalDamage);
    System.out.println(my35first.getStatus());
    System.out.println(my35first.isPriority);
    System.out.println(my35first.refill(45));
    System.out.println(my35first.getStatus());
    System.out.println(my35first.refill(45));
    System.out.println(my35first.getStatus());
    System.out.println(my35first.fight());
    System.out.println(my35first.getStatus());
    System.out.println(my35first.totalDamage);
    System.out.println(my35first.refill(4));
    System.out.println(my35first.getStatus());
    System.out.println(my35first.fight());
    System.out.println(my35first.getStatus());
    System.out.println(my35first.totalDamage);
    System.out.println(my35first.getClass().getSimpleName());*/

  }
}
