package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Josephus {
    public static void main(String[] args) {
        int numberOfPart = 13;
        int alive = 0;
        int[] participants = new int[numberOfPart];
        for (int i = 0; i < numberOfPart; i++) {
            participants[i] = 1;
            alive++;
        }

        int z = 0;
        while ((alive > 1)) {
            for (int i = 0; i < numberOfPart; i++) {
                if (participants[i] == 1) {
                    z++;
                }

                if ((participants[i] == 1) && (z % 2 == 0)) {
                    participants[i] = 0;
                    alive--;
                }
            }
        }
        int i = 0;
        while (participants[i] == 0) {
            i++;
        }
        System.out.println(Arrays.toString(participants));
        System.out.println(i + 1);
    }
}



