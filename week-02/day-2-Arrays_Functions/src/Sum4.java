import java.util.Scanner;

public class Sum4 {
    public static void main(String[] args) {
        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

        System.out.println("The sum of the given numbers is: " + sum());

    }

    public static int sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you wand to add?");
        int numbersToAdd = scanner.nextInt();
        int adding = 0;
        for (int i = 0; i < numbersToAdd; i++) {
            System.out.println("Give me the " + (i + 1) + ". number!");
            Scanner scanner1 = new Scanner(System.in);
            int numbers = scanner1.nextInt();
            adding += numbers;
        }
       // System.out.println("The sum of the given numbers is: " + adding);
        return adding;
    }
}
