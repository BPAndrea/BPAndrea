import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
        Scanner input = new Scanner(System.in);
        System.out.println("Give me one side of the cuboid:");
        double a=input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Give me the next side of the cuboid:");
        double b=input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Give me the last side of the cuboid:");
        double c=input3.nextInt();

        double volume=a*b*c;
        double surface=(2*(a*b+b*c+c*a));

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: "+ volume);

    }
}
