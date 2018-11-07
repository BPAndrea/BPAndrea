import java.util.Arrays;

public class Reverse19 {
    // - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

   // for(int i=0; i<array.length/2; i++){ int temp = array[i]; array[i] = array[array.length -i -1]; array[array.length -i -1] = temp; }


    public static void main(String[] args) {
        int [] aj={3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(aj));
        for(int i=0; i<aj.length/2; i++){
            int temp = aj[i];
            aj[i] = aj[aj.length -i -1];
            aj[aj.length -i -1] = temp;
        }
        System.out.println(Arrays.toString(aj));
    }
}
