import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number!");
        int number = input.nextInt();
        String triangle = "";
        for (int i = 1; i <= number; i++) {
            //triangle= triangle+"*";
            System.out.println(triangle);
            //triangle = triangle + "*";
            for (int j = 0; j <= number; j++) {
                triangle = triangle + "*";
                System.out.println(triangle);
            }
        }
    }
}
