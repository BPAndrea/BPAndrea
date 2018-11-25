public class Doubling1 {

    public static void main(String[] args) {
        /// 1.- Create an integer variable named `baseNum` and assign the value `123` to it
        int baseNum= 123;
        // 3.- Print the result of `doubling(baseNum)`
        System.out.println(doubling(baseNum));

    }
    // 2. - Create a function called `doubling` that doubles it's input parameter and returns with an integer
    public static int doubling(int number){
        //number=2*number;
        //System.out.println(number);
        return number*=2;

    }
}
