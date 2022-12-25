public class Variable {
    public static void main(String[] args) {
        String name; // Only can store String DataType.
        name = "Hanif Fauzi Hakim";

        int age = 22; // Only can store Integer Data Type.

        System.out.println(name);
        System.out.println(age);

        // Java 10 support var keywords to init a variable. 
        // but the variable must be have a value

        var firstName = "Hanif Fauzi";
        var lastName = "Hakim";
        var salary = 9000000;

    }
}
