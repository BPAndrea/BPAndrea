import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        //System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        //System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
        int[] arr = {1, 11, 34, 52, 61};
        int findMe = 1;
        int findMe2=9;

        System.out.println(findNumber(findMe, arr));
        System.out.println(findNumber(findMe2, arr));
    }

    public static ArrayList<Integer> findNumber(int findMe, int[] arr) {
        ArrayList<Integer> toReturn=new ArrayList<>();
        ArrayList<Integer> rest=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%10==findMe){
                toReturn.add(i);
            }else if ((int)(arr[i]/10)==findMe){
                toReturn.add(i);
            }
        }
        return toReturn;
    }
}






