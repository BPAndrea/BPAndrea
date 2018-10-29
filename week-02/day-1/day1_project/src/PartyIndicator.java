import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys

        Scanner input = new Scanner(System.in);
        System.out.println("What do you think, how many girls will come to the party? Write only a number (in integer form):");
        int girls = input.nextInt();
        System.out.println(" ... and how many boys?");
        int boys = input.nextInt();
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
        if (girls == boys && (girls + boys >= 20))
            System.out.println("The party is excellent!");
            // It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        else if ((girls != boys) && (girls + boys >= 20))
            System.out.println("Quite cool party!");
        // It should print: Average party...
        // If there are less people coming than 20
        else if (girls!=0 &&(girls + boys < 20))
            System.out.println("Average party...");
            /*
It should print: Sausage party
If no girls are coming, regardless the count of the people
*/
        else if (girls==0)
            System.out.println("Sausage...");
        else
            System.out.println("Default ág..");
    }
}
