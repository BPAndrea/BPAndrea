public class DrawChessTable35 {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
/*        int sizeOfTable = 9;
        for (int i = 1; i <= sizeOfTable; i++) {
            if ((i % 2) != 0) {
                for (int j = 1; j <= sizeOfTable; j++) {
                    String print = "";
                    if (j % 2 != 0) {
                        System.out.print(print + "%");
                    } else {
                        System.out.print(print + " ");
                    }
                }
                System.out.println();
            } else {
                for (int j = 1; j <= sizeOfTable; j++) {
                    String print = "";
                    if (j % 2 != 0) {
                        System.out.print(print + " ");
                    } else {
                        System.out.print(print + "%");
                    }
                }
                System.out.println();
            }

        }*/
        //Solution Nr. 2
       /* int sizeOfTable = 9;
        for (int i = 1; i <= sizeOfTable; i++) {
            for (int j = 1; j <= sizeOfTable; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("%");
                else
                    System.out.print(" ");

            }
            System.out.println();
            }
*/
        //Solution Nr. 3
        int sizeOfTable = 9;
        for (int i = 1; i <= sizeOfTable; i++) {
            for (int j = 1; j <= sizeOfTable; j++) {
                if (i % 2 != 0 && j % 2 != 0)
                    System.out.print("%");
                else if (i % 2 == 0 && j % 2 == 0)
                    System.out.print("%");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }
}