import java.util.Scanner;

public class GuessMyNumberRandom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers for range customization: ");
        int minimum = input.nextInt();
        int maximum = input.nextInt();
        int randomNumber = (int) (minimum + (Math.random() * (maximum - minimum)));
        int lives = 5;

        System.out.println("I've the number between " + minimum + "-" + maximum + ". You have " + lives + " lives. Guess my number: ");
        int guess =0;

        while (guess!=randomNumber && lives>=0) {
            Scanner input1 = new Scanner(System.in);
            guess = input1.nextInt();
            if (guess < randomNumber) {
                //lives--;
                System.out.println("Too low. You have " + lives-- + " lives left. ");
            } else if (guess > randomNumber){
                //lives--;
                System.out.println("Too high. You have " + lives-- + " lives left.");
            }
        }

        while ((guess==randomNumber) || lives<0){
            if (guess==randomNumber) {
                System.out.println("Congratulations. You won.");
                break;
            }else {
                System.out.println("The game is over. Sorry, you lost.");
                break;
            }
        }
    }

}
