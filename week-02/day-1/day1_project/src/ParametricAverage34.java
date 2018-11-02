import java.util.Scanner;

public class ParametricAverage34 {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers to you want to enter? ");
        int numberOfIntegers= input.nextInt();
        int sum=0;
        for (int i=1; i<=numberOfIntegers; i++){
            System.out.println("Give me number Nr."+i);
            Scanner input2 = new Scanner(System.in);
            int numbers= input2.nextInt();
            //System.out.println("Give me number Nr."+i);
            sum+=numbers;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " +((double)sum/numberOfIntegers));

    }


}
