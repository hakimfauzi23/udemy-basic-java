public class IfStatement {
    public static void main(String[] args) {
        elseIfStatement();
    }

    public static void ifElseStatement() {
        var nilai = 80;
        var absen = 60;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Congrats! You're Passed!");
        } else {
            System.out.println("Try again next year!");
        }

    }

    public static void ifStatement() {
        var nilai = 80;
        var absen = 60;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Congrats! You're Passed!");
        }
    }

    public static void elseIfStatement() {
        var nilai = 80;
        var absen = 90;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Congrats! You got A!");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("You got B!");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("You got C!");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("You got D!");
        } else {
            System.out.println("You got E!! Try again next year!");
        }
    }
}
