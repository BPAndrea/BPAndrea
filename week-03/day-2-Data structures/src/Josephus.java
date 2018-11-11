package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Josephus {
    public static void main(String[] args) {
        int numberOfPart = 10; //3
        int alive = 0;
        int[] participants = new int[numberOfPart];
        for (int i = 0; i < numberOfPart; i++) {
            if (i % 2 != 1) {
                participants[i] = 1;
                alive++;
            } else {
                participants[i] = 0;
            }
        }

        System.out.println(Arrays.toString(participants));
        while ((alive > 1)) {
            if ((participants[numberOfPart - 1] == 1) || ((participants[numberOfPart - 2] == 1) && (participants[numberOfPart - 1] == 0))) {

                for (int k = 0; k < numberOfPart - 1; k++) {
                    if (participants[k] == 1) {
                        participants[k] = 0;
                        alive--;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < numberOfPart - 1; i++) {
            if (participants[i] == 1) {
                for (int j = i + 1; j < numberOfPart - 1; j++) {
                    if (participants[j] == 1) {
                        participants[j] = 0;
                        alive--;
                        break;
                    }
                }
            }

        }
        System.out.println(Arrays.toString(participants));
        // }
        //
        System.out.println(alive);


        System.out.println(Arrays.toString(participants));
        for (
                int h = 0; h < (numberOfPart); h++) {
            if (participants[h] == 1) {
                System.out.println(h + 1);
            }

        }
    }
}
