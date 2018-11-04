import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
//        Exercise
//        Create a function named is anagram following your current language's style guide.
//        It should take two strings and return a boolean value depending on whether its an anagram or not.
        String first = "AnaGramma";
        String second = "aMMagraNa";
        System.out.println(anagram(first, second));
    }

    public static boolean anagram(String a, String b) {
        boolean isAnagram = true;
        if (a.length() != b.length()) {
            isAnagram = false;
        } else {
            a = a.toLowerCase();
            b = b.toLowerCase();
            //Ellenőrzés 1- kisbetűsek-e?
            //System.out.println("1. Check- LowerCase "+a+"+"+b);
            char[] firstArray = a.toCharArray();
            char[] secondArray = b.toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            String sortedA = new String(firstArray);
            String sortedB = new String(secondArray);
            //Ellenőrzés 2 - betűk abc sorrendben?
            //System.out.println("2nd Check: "+sortedA + "+" + sortedB);

            //I. megoldási alternatíva - a két string összehasonlítása ciklussal
           /* for (int i = 0; i < sortedA.length(); i++) {
                //rossz ág volt, nem kell beágyazott 2. ciklus!! for (int j = 0; j < sortedB.length(); j++) {
                if (sortedA.charAt(i) != sortedB.charAt(i)) {
                    isAnagram = false;
                }
            }*/
            //II. megoldási alternatíva "contentEquals" metódus használata:

            //3. ellenőrzés: egyenlő-e:
            //System.out.println("3rd check: " + (sortedA.contentEquals(sortedB)));
            if ((sortedA.contentEquals(sortedB) != true)) {
                isAnagram = false;
            }

        }
        return isAnagram;
    }
}
