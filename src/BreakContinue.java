public class BreakContinue {
    public static void main(String[] args) {
        // breakKeyword();
        continueKeyword();
    }

    public static void breakKeyword() {
        /*
         * Break will stop process of loop!
         * Literally STOP!
         */
        var counter = 1;

        while (true) {
            System.out.println("Perulangan Ke-" + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }

        System.out.println("Perulangan Berhenti!");
    }

    public static void continueKeyword() {
        for (var counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 0) {
                continue;
            }

            System.out.println("Perulangan Ganjil " + counter);
        }
    }
}
