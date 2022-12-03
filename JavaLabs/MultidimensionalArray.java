public class MultidimensionalArray {
    public static void main(String[] args) {
        System.out.println("Here is a table showing the most common interracial marriages in the United States");
        System.out.println("Data does not include Hispanics because Hispanics can be of any race.");

        final int RANK = 4;
        final int AMOUNT = 2;

        int[][] ranks = {
                {902, 1},
                {477, 3},
                {294, 2},
                {265, 4},

        };

        String[] names = {
                "WM AF",
                "BM WF",
                "AM WF",
                "WM BF",
        };

        System.out.println("Couples | Total marriages | Rank");
        System.out.println("-------------------------------");

        for (int i = 0; i < RANK; i++) {
            System.out.printf("%s ", names[i]);

            for (int j = 0; j < AMOUNT; j++) {
                System.out.printf(" %10d", ranks[i][j]);
            }

            System.out.println("\n");
        }
    }
}