public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a+=10;
        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b-=7;
        System.out.println(b);

        int c = 44;
        // please double c's value
        c*=2;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d/=5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e*=8;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean f1Value=(f1>f2);
        // tell if f1 is bigger than f2 (print as a boolean)
        if(f1>f2){
            System.out.println("f1 a nagyobb");
        }else {
            System.out.println("f2 a nagyobb");
        }
        System.out.println(f1Value);


        int g1 = 350;
        int g2 = 200;
        boolean g2Value=(2*g2>g1);
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        System.out.println(g2Value);

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        boolean divisor= false;
        if (h%11==0){
            divisor=true;
        }
        System.out.println(divisor);


        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        boolean firstCond=(i1>i2*i2);
        boolean secCond=(i1<i2*i2*i2);
        System.out.println("A válasz: "+ (firstCond && secCond));


        int j = 1521;
        boolean div3=false;
        if (j%3==0)
              div3=true;
        boolean div5=false;
        if (j%5==0)
            div5=true;

        // tell if j is dividable by 3 or 5 (print as a boolean)
        System.out.println(div3 || div5);
        //System.out.println(div3);
        //System.out.println(div5);

        String k = "Apple";
        //fill the k variable with its content 4 times
        for (int i=0; i<3; i++)
            k=k+ " Apple";
        System.out.println(k);
    }
}
