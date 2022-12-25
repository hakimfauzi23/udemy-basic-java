public class ForLoop {
    public static void main(String[] args) {
        // foreverLoop();
        // loopWithCondition();
        loopWithPostStatement();
    }

    public static void foreverLoop() {

        // Will cause deadlock!!
        for (;;) {
            System.out.println("Perulangan");
        }
    }

    public static void loopWithCondition() {
        var counter = 1;

        // If the expression is true, it will run loop!
        for (; counter <= 10;) {
            System.out.println("Perulangan " + counter);
            counter++;
        }
    }

    public static void loopWithInitStatement() {
        for (var counter = 1; counter <= 10;) {
            System.out.println("Perulangan " + counter);
            counter++;
        }
    }

    public static void loopWithPostStatement() {
        for (var counter = 1; counter <= 10; counter++) {
            System.out.println("Perulangan " + counter);

        }
    }
}
