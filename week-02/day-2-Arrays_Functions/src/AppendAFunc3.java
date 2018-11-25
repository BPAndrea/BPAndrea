public class AppendAFunc3 {
    public static void main(String[] args) {
// - Create a string variable named `typo` and assign the value `Chinchill` to it
        String typo = "Chinchill";
        System.out.println(appendAFunc(typo));
        }

    // - Write a function called `appendAFunc` that gets a string as an input,
    //   appends an 'a' character to its end and returns with a string
    // - Print the result of `appendAFunc(typo)`
    public static String appendAFunc(String typo) {
       // String toReturn = typo + "a";
        typo+="a";
        //System.out.println(toReturn);
        return typo;
    }
}

