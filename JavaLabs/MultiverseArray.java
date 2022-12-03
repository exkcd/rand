public class MultiverseArray {
    public static void main(String[] args) {
        System.out.println("Here is a table showing the top 10 most popular boy baby names from the early 2000s");

        final int RANK = 10;
        final int AMOUNT = 2;

        int[][] ranks = {
                {273945, 1},
                {250633, 2},
                {231983, 3},
                {221573, 4},
                {203832, 5},
                {203336, 6},
                {202517, 7},
                {201802, 8},
                {194829, 9},
                {194343, 10}

        };

        String[] names = {
                "Jacob",
                "Michael",
                "Joshua",
                "Matthew",
                "Daniel",
                "Christopher",
                "Andrew",
                "Ethan",
                "Joseph",
                "William"
        };

        System.out.println("      Names | Popularity | Rank");
        System.out.println("-------------------------------");

        for (int i = 0; i < RANK; i++) {
            System.out.printf("%11s", names[i]);

            for (int j = 0; j < AMOUNT; j++) {
                System.out.printf("%10d", ranks[i][j]);
            }

            System.out.println("\n");
        }
    }
}
