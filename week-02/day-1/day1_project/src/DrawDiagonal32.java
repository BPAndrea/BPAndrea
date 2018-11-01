import java.util.Scanner;

public class DrawDiagonal32 {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines?");
        int squareLines = scanner.nextInt();

        for (int i = 1; i <= squareLines; i++) {
            if (i == 1 || i == squareLines) {
                for (int j = 1; j <= squareLines; j++) {
                    System.out.print("%");
                }
                System.out.println();

            } else {
                for (int k = 1; k <= squareLines; k++)
                    if (k == 1 || k == i || k == squareLines) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }

                System.out.println();
            }


        }


    }
}




