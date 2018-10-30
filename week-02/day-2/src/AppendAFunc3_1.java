public class AppendAFunc3_1 {
    public static void main(String[] args) {
// / - Create a string variable named `typo` and assign the value `Chinchill` to it
        String typo= "Chinchill";
        System.out.println(appendAFunc(typo));

    }

    // - Write a function called `appendAFunc` that gets a string as an input,
    //   appends an 'a' character to its end and returns with a string
    // - Print the result of `appendAFunc(typo)
    public static String appendAFunc(String input){
        return input + "a";
    }

    }
