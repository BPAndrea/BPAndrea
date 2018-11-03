import java.util.Scanner;

public class Sum4_1 {
    public static void main(String[] args) {
        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you wand to add?");
        int numbersToAdd = scanner.nextInt();

        System.out.println("The sum of the given numbers is: " + sum(numbersToAdd));

    }

    public static int sum(int input) {
        int sum = 0;
        for (int i = 0; i < input; i++) {
            System.out.println("Give me the " + (i + 1) + ". number!");
            Scanner scanner1 = new Scanner(System.in);
            int numbers = scanner1.nextInt();
            sum += numbers;
        }
        // System.out.println("The sum of the given numbers is: " + adding);
        return sum;
    }
    }

