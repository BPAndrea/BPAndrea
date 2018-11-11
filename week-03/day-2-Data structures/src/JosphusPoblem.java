import java.util.Arrays;

public class JosphusPoblem {
    public static void main(String[] args) {
        int numberOfPart = 16;
        int alive = 0;
        int actualPos = 0;
        int[] participants = new int[numberOfPart];
        //filling the array with 1 - participants being alive
        for (int i = 0; i < numberOfPart; i++) {
            participants[i] = 1;
            alive++;
        }

        do {
            //checking each iteration
            System.out.println(Arrays.toString(participants));

            do {
                actualPos++;
                if (actualPos >= participants.length) {
                    actualPos = 0;
                    //actualPos-=participants.length;
                }
            } while (participants[actualPos] == 0);
            participants[actualPos] = 0;
            alive--;

            do {
                actualPos++;
                if (actualPos >= participants.length) {
                    actualPos = 0;
                    //actualPos-=participants.length;
                }
            } while (participants[actualPos] == 0);
        } while (alive > 1);

        System.out.println(actualPos + 1);



    }

}
