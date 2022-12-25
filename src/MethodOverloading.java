public class MethodOverloading {
    /*
     * Method overloading to create same method
     * With Different variety (params, return type, etc!)
     */
    public static void main(String[] args) {
        sayHello();
        sayHello("Hakim");
        sayHello("Hanif", "Hakim");
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
