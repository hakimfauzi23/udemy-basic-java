public class ExpressionStatementBlock {
    public static void main(String[] args) {
        block();
    }

    public static void expression() {
        /*
         * Expression is single value
         * Something that produce single value is an expression
         */
    }

    public static void statement() {
        /*
         * Statement is group of expression
         * Statement is full code in the language
         */

    }

    public static void block() {
        /*
         * Block is group of statement(s)
         * Block are caged with curly brackets `{}`
         */

        System.out.println("Hello Block 1");
        System.out.println("Hello Block 2");
        System.out.println("Hello Block 3");

        // This is new Block
        {
            System.out.println("This is block inside block!");
        }
    }
}
