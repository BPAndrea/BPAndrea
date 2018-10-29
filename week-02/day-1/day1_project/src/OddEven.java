import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner input= new Scanner(System.in);
        System.out.println("Write a number (integer pls):");
        int number=input.nextInt();
        if(number%2==0){
            System.out.println(number + " is an even(magyarul páros) number!");
        }else{
            System.out.println(number + " is an odd (magyarul páratlan) number!");
        }
    }
}
