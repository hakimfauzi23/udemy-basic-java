public class SwitchStatement {
    public static void main(String[] args) {
        normalSwitch();
        lambdaSwitch();
        switchWithYield();
    }

    public static void normalSwitch() {
        var nilai = "C";

        switch (nilai) {
            case "A":
                System.out.println("You graduate with grade A!");
                break;
            case "B":
            case "C":
                System.out.println("Your grade is not bad!");
                break;
            case "D":
                System.out.println("You're failed! Try Again Next Year!");
                break;
            default:
                System.out.println("Invalid Value!");
        }
    }

    public static void lambdaSwitch() {
        /*
         * Java 14 Higher only!
         */
        var nilai = "A";

        switch (nilai) {
            case "A" -> System.out.println("You graduate with grade A!");
            case "B", "C" -> System.out.println("Your grade is not bad!");
            case "D" -> System.out.println("You're failed! Try Again Next Year!");
            default -> {
                System.out.println("Invalid Value!");
            }
        }
    }

    public static void switchWithYield() {
        /*
         * Java 14 Higher only!
         */
        var nilai = "A";

        String greet = switch (nilai) {
            case "A":
                yield "You graduate with grade A!";
            case "B", "C":
                yield "Your grade is not bad!";
            case "D":
                yield "You're failed! Try Again Next Year!";
            default:
                yield "Invalid Value!";
        };

        System.out.println(greet);
    }
}
