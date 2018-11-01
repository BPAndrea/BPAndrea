import java.util.Scanner;
import java.util.Arrays;


public class DrawPyramid {
    // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
////
//
//
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number!");
        int number = input.nextInt();

//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= number - i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int k = 1; k <= (i * 2) - 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number * 2 - 1; j++) {
                if (j < (number + i) && j > (number - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }
}