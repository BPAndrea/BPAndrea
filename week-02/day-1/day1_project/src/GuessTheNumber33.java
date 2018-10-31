import java.util.Scanner;

public class GuessTheNumber33 {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int storedNumber = 8;
        int guess;

        boolean win = false;

        while (win == false) {
            System.out.println("Guess my number: ");
            guess = input.nextInt();
            if (guess < storedNumber) {
                System.out.println("The stored number is higher");
                // guess = 0;
            } else if (guess > storedNumber) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("You found the number: "+storedNumber);
                win=true;
            }
        }
    }
}
