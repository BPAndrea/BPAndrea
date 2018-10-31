import java.util.Arrays;

public class AppendA16 {
    // - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end

    //    int[] array = new int[] {1, 2, 3};
//    System.out.println(Arrays.toString(array));
//    array = Arrays.copyOf(array, array.length + 1); //create new array from old array and allocate one more element
//    array[array.length - 1] = 4;
//    System.out.println(Arrays.toString(array))
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr"};
        //System.out.println(Arrays.toString(animals));
        // create new array from old array and allocate one more element
//        animals = Arrays.copyOf(animals, animals.length + 1);
//        animals[3] = "a";
//        System.out.println(Arrays.toString(animals));
        for (int i=0; i<animals.length; i++)
            animals[i]=animals[i]+"a";
        System.out.println(Arrays.toString(animals));
    }
}
