/**
 * @author Drumstyle92
 * class that contains the whole program.
 */
public class Test {
    /**
     *
     * @param args main parameter.
     * method that contains booleans and prints.
     */
    public static void main(String[] args) {
        System.out.println("-------------boolean1---------");
        boolean a = !(!(!(false ^ false) || (true && true)));
        System.out.println("A: " + a);

        System.out.println("-------------boolean2---------");
        int x = 3;
        int y = 2;
        boolean b = !((x * y) <= 6) && (x - y != 1);
        System.out.println("B: " + b);

    }
}
