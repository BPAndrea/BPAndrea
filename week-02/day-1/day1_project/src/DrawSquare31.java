import java.util.Scanner;

public class DrawSquare31 {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was

        Scanner input = new Scanner(System.in);
        System.out.println("Give me the number of lines: ");
        int numberOfLines = input.nextInt();
        for (int i = 1; i <= numberOfLines; i++) {
            if (i == 1 || i == numberOfLines) {
                for (int j = 1; j <= numberOfLines; j++) {
                    System.out.print("%");
                }
                System.out.println();

            } else {
                for (int k = 1; k <= numberOfLines; k++)
                    if (k == 1 || k == numberOfLines) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }

                System.out.println();


/*        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = 1; j <= numberOfLines; j++) {
                if (i == i || i == numberOfLines) {
                    System.out.print("%");
                } else if (j == 1 || j == numberOfLines) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();*/

            }
        }
    }
}
