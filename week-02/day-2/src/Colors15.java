public class Colors15 {
    // - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`
/*    String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
    };
    // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
    // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);*/
    public static void main(String[] args) {
        String[][] colors = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"}
        };
        System.out.println(colors[0][0] +" " +colors[0][1]);
    }
}
