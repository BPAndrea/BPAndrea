import java.util.Scanner;

public class PrintParams {
    // - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters
    // Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
    public static void main(String[] args) {
        System.out.println(printParams("first", "second", "third", "hello"));

    }
    public static String printParams(String... args){
        String temp="";
            for(int i=0; i<args.length; i++){
              temp=temp+args[i]+", ";

        }
        return temp;

    }
}
 /*   public void foo(String... args) {
        for (String arg : args) {
            // do smth with arg.
        }
    }*/