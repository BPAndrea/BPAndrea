import java.util.Arrays;

public class DoubleItems14 {
    // - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array
    public static void main(String[] args) {
        int [] numList= {3, 4, 5, 6, 7};
        for (int i=0; i<numList.length; i++){
            numList[i]+=numList[i];
        }
        System.out.println(Arrays.toString(numList));
    }
}