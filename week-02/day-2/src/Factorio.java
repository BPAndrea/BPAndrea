import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        // - Create a function called `factorio`
        //   that returns it's input's factorial
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number!");
        int numberToFact = scanner.nextInt();
//        int result1=factorio(numberToFact);
//        System.out.println(result1);
        System.out.println(factorio(numberToFact));

    }

    public static int factorio(int input) {
            int result=1;
            for(int i=0; i<input; i++){
                result=result*(i+1);
            }
            return result;
    }

}
