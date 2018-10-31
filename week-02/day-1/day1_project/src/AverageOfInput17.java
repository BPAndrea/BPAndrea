import java.util.Scanner;

public class AverageOfInput17 {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number1=input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number2=input.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number3=input.nextInt();
        Scanner input4 = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number4=input.nextInt();
        Scanner input5 = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number5=input.nextInt();

        int sum=number1+number2+number3+number4+number5;
        double average=sum/5.;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
    }
}
