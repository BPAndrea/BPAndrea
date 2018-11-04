import java.util.Scanner;

public class DrawDiamond30 {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was


        Scanner input = new Scanner(System.in);
        System.out.println("How many lines?");
        int number = input.nextInt();

        System.out.println("Diamondok");
        System.out.println("Első megoldás: matematikai műveletet használva az if feltételekben logikai függvényt alkalmazva");
//mátrixon belül függvénnyel engedi a csillagokat
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (j > (Math.abs(i-((number+1)/2))) && j < ((number+1-Math.abs(i-((number+1)/2)))))
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Másik megoldás:a csillagok és a spacek számát váltáztatva");
//a csillagok és a space számát változtatja, és for ciklusban soronként kiírja a space-okat majd a csillagokat
//ha lemegy egy sor akkor a diamond középvonala felett növeli a csillagok számát és csókkenti a spaceok számát
//ha lemegy egy sor akkor a diamond középvonala alatt csökkenti a csillagok számát és növeli a spaceok számát

        int star = 1;
        int space = number / 2;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println("");
            if(i<(number/2)){
                star=star+2;
                space=space-1;
            }else {
                star=star-2;
                space=space+1;
            }
        }
        System.out.println("Harmadik megoldás:meredekséget változtatva");
//mátrixot rajzol
//ha lemegy egy sor akkor a diamond középvonala felett növeli a csillagok számát
//ha lemegy egy sor akkor a diamond középvonala alatt csökkenti a csillagok számát
// a sor közepétől (diamond csúcs) figyeli a csillagok számát. Gyakorlatilag a diamond oldalának meredekségét tartalmazza
        int star1 = 1;
        int space1 = number / 2;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((j > (number / 2) - star1) && (j < (number / 2) + star1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            if(i<(number/2)){
                star1=star1+1;
            }else {
                star1=star1-1;
            }
        }

        System.out.println("Negyedik megoldás:eljárással");
//a csillagok és a space számát változtatja, és for ciklusban soronként kiírja a space-okat majd a csillagokat
//ha lemegy egy sor akkor a diamond középvonala felett növeli a csillagok számát és csókkenti a spaceok számát
//ha lemegy egy sor akkor a diamond középvonala alatt csökkenti a csillagok számát és növeli a spaceok számát
//eljárást hiv meg a kiírásnál: void szerepela static után, és nincs return
        int star2 = 1;
        int space2 = number / 2;
        for (int i = 0; i < number; i++) {
            diamond_sor_kiiras(star2,space2);
            System.out.println("");
            if(i<(number/2)){
                star2=star2+2;
                space2=space2-1;
            }else {
                star2=star2-2;
                space2=space2+1;
            }
        }

    }
    public static void diamond_sor_kiiras(int a, int b) {
        for (int j = 0; j < b; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < a; j++) {
            System.out.print("*");
        }
    }
}
