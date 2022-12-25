public class MethodJava {

    /*
     * Method or function is a block of code
     * can be run or call with () in the main
     * 
     */
    public static void main(String[] args) {
        sayHelloWorld();
        sayHello("Hanif Fauzi", "Hakim");
        System.out.println(sum(100, 30));
    }

    // This is a method!
    static void sayHelloWorld() {
        System.out.println("Hello World1!");
        System.out.println("Hello World2!");
        System.out.println("Hello World3!");
    }

    // This method require a parameter!
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    // This method return integer value only!!
    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    
}
