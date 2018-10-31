import java.util.Scanner;

public class PrintBigger20 {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number1=input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Give me another number: ");
        int number2=input.nextInt();
        if(number1>number2){
            System.out.println(number1+ " is bigger");
        }else {
            System.out.println(number2+ " is bigger");
        }
    }
}
