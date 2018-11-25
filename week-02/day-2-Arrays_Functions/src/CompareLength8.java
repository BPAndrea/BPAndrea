public class CompareLength8 {
    // - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`
    public static void main(String[] args) {
        int []q={1, 2, 3};
        int []p2={4, 5};
        System.out.println(p2.length>q.length);
        if(q.length>p2.length){
            System.out.println("Array \"q\" has more elements than \"p2\".");
        }else
        System.out.println("Array \"p2\" has more elements than \"q\".");
    }
}
