public class TIpeDataArray {
    public static void main(String[] args) {
        /*
         * Array size cannot be modified
         * You can delete the element by replace it with null value.
         */

        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Hanif";
        arrayString[1] = "Fauzi";
        arrayString[2] = "Hakim";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        // Init Array
        String[] fullName = {
                "Hanif", "Fauzi", "Hakim"
        };

        int[] arrayInt = new int[] {
                1, 2, 3, 4, 5, 6, 7
        };

        System.out.println(arrayInt.length);

        /* Multidimensional Array */
        String[][] members = {
            {"Hanif", "Fauzi"},
            {"Fauzi1", "Hakim1"},
            {"Joko", "Hakim3"},
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][1]);
    }
}
