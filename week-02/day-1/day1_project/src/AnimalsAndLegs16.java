 import java.util.Scanner;

public class AnimalsAndLegs16 {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner input = new Scanner(System.in);
        System.out.println("Give me the number of the chickens: ");
        int chicken=input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Give me the number of the pigs: ");
        int pig=input.nextInt();

        int legs=(2*chicken+4*pig);
        System.out.println(legs);
    }
}
