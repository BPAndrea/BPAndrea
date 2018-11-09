import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int numToCheck = scanner.nextInt();

        int power = digit(numToCheck);
        int armstrNumber = toPower(numToCheck, power);

        if (numToCheck == armstrNumber) {
            System.out.println(numToCheck + " is an Armstrong number.");
        } else {
            System.out.println("Sorry, but " + numToCheck + " is not an Armstrong number.");
        }
        //For checking the values of variables:
        //System.out.println("Number to  check: " + numToCheck);
        //System.out.println("Armstr: " + armstrNumber);
    }

    public static int digit(int input) {
        int iteration = 0;
        while (input > 0) {
            input /= 10;
            iteration++;
        }
        return iteration;
    }

    public static int toPower(int numToCheck, int power) {
        int armstNumber = 0;
        for (int i = 0; i < power; i++) {
            armstNumber += Math.pow((numToCheck % 10.), (power * 1.));
            numToCheck /= 10;
        }
        return armstNumber;
    }
}
