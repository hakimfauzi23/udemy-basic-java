public class DoWhileLoop {
    public static void main(String[] args) {
        /*
         * Do first then check the condition, reverse of While loop!
         * Even the condition is false, do block code will always be exe!
         */

        var counter = 100;

        do {
            System.out.println("Perulangan Ke-" + counter);
            counter++;
        } while (counter <= 10);
    }
}
