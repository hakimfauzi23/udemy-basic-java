public class MathOperation {
    public static void main(String[] args) {

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        /*
         * Augmented Assignments
         */

        int c = 100;

        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        /*
         * Unary Operator (Placed in front of variable)
         */

        int d = +100;
        int e = -10;

        d++; // Add 1 ;
        System.out.println(d);

        d--; // Reduce 1
        System.out.println(d);
    }
}
