package Sharpie;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    /*Sharpie Set
    - Reuse your Sharpie class: ok
    - Create SharpieSet class: ok
   -  it contains a list of Sharpie
                    countUsable() -> sharpie is usable if it has ink in it
                    removeTrash() -> removes all unusable sharpies*/


    //Based on the Fleet of Things exercise:
    private ArrayList<Sharpie> sharpieSet;


    public SharpieSet() {
        sharpieSet = new ArrayList<>();
    }

 /*  You don't need that method if you write the next one - returning sharpieset as an ArrayList to main (that way you can use
 all the methods for an ArrayList.

  public void addSharpie (Sharpie sharpie){
     sharpieSet.add(sharpie);
    }*/

    public ArrayList<Sharpie> sharpieSet() {
        return sharpieSet;
    }

    public int countUsable() {
        int emptyCount = 0;
        for (int i = 0; i < sharpieSet.size(); i++) {
            if (sharpieSet.get(i).inkAmount <= 0) {
                sharpieSet.get(i).isEmpty = true;
                emptyCount++;
            }
        }
        System.out.println("Number of empty sharpies: " + emptyCount);
        System.out.println("Number of usable sharpies: " + (sharpieSet.size() - emptyCount));
        return emptyCount;
    }

    public int removeTrash() {
        int sharpiesToRemove = 0;
        for (int i = 0; i < sharpieSet.size(); i++) {
            if (sharpieSet.get(i).isEmpty == true) {
                sharpieSet.remove(i);
                sharpiesToRemove++;
                System.out.println(sharpieSet.get(i).color + " is empty. It has been removed.");
            }
        }
        System.out.println("Number of removed empty sharpies: " + sharpiesToRemove);
        return sharpiesToRemove;
    }

}

