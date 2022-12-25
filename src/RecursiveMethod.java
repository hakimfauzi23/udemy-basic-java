public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialWithRecursive(5));
        loop(100);
    }

    static int factorialLoop(int Value) {
        var result = 1;
        for (var counter = 1; counter <= Value; counter++) {
            result = result * counter;
        }

        return result;
    }

    static int factorialWithRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialWithRecursive(value - 1);
        }
    }

    // This method will cause Error Stack Overflow!
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Done!");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }
}
