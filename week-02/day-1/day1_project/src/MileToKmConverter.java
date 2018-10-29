import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner input= new Scanner(System.in);
        System.out.println("Írj be egy távolságot km-ben! Csak egész számokat használj!");
        int distanceInKm=input.nextInt();
        float distanceInMiles= (float) (distanceInKm*0.62137119224);
        System.out.println(distanceInKm +" km mérföldben ennyi lenne: " +distanceInMiles+".");
    }
}