import java.util.Arrays;

public class DiagonalMatrix13 {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    public static void main(String[] args) {
        int[][] multi = new int[4][4];
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                if (i == j) {
                    multi[i][j]=1;
                     }
                    System.out.print(multi[i][j]);
                }
                System.out.println();
            }
         }
    }

