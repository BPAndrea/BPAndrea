package Sharpie;


import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    //Sharpie exercise:
    Sharpie sharpie1 = new Sharpie("blue", (float) 1.2);
    Sharpie sharpie2 = new Sharpie("red", (float) 3.2);
    Sharpie sharpie3 = new Sharpie("pink", (float) 2.5);
    sharpie1.use();
    for (int i = 0; i < 99; i++) {
      sharpie1.use();
    }
    System.out.println(sharpie1.inkAmount);
    System.out.println(sharpie2.inkAmount);

    //Sharpie set:
        /*Sharpie Set
        - Reuse your Sharpie class: ok
        - Create SharpieSet class: ok
       -  it contains a list of Sharpie
                        countUsable() -> sharpie is usable if it has ink in it
                        removeTrash() -> removes all unusable sharpies*/
    SharpieSet newSet = new SharpieSet();
    newSet.sharpieSet().add(sharpie1);
    newSet.sharpieSet().add(sharpie2);
    newSet.sharpieSet().add(sharpie3);
    newSet.countUsable();
    System.out.println(newSet.sharpieSet().get(0).inkAmount);
    newSet.removeTrash();
  }
}
