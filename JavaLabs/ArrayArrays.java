import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayArrays {
    public static void main(String[] args) {
        Sunrays rn = new Sunrays();
        rn.randNum();

        Sunrays rc = new Sunrays();
        rc.randCountries();
    }

    public void randNum() {
        Random randNum = new Random();

        ArrayList<Integer> numArrayList = new ArrayList<>();

        int[] ListyBoi = new int[20]; // initialized new integer list called "ListyBoi" because fun names make it better.

        // generates random numbers to fill in ListyBoi.
        for (int i = 0; i <ListyBoi.length; i++) {
            ListyBoi[i] = randNum.nextInt(99);
            numArrayList.add(randNum.nextInt(99));
        }
        System.out.println("The random array numbers are: ");
        System.out.println(Arrays.toString(ListyBoi));
        Arrays.sort(ListyBoi);
        System.out.println();

        System.out.println("The array numbers in ascending order are: ");
        System.out.printf("%s", Arrays.toString(ListyBoi) + "\n");
        Arrays.sort(ListyBoi);
        System.out.println("\n");


        System.out.println("The random ArrayList numbers are: ");
        System.out.println(Arrays.toString(numArrayList.toArray()));
        System.out.println();

        numArrayList.add(Integer.valueOf("1337"));
        Collections.sort(numArrayList);
        System.out.println("The random ArrayList numbers is ascending order (with added value) are: ");
        System.out.println(Arrays.toString(numArrayList.toArray()));
        System.out.println("\n");
    }
    public void randCountries() {

        String[] ListyCountries = {"United States", "Canada", "Mexico", "England", "Ireland", "Denmark", "Switzerland", "Norway", "Sweden", "South Korea", "Singapore", "Hong Kong", "Philippines", "Malaysia",
        "Thailand", "China", "Japan", "Taiwan", "Greece", "Germany"};

        ArrayList<String> strCountries = new ArrayList<>();

        strCountries.add("Russia");
        strCountries.add("Kazakhstan");
        strCountries.add("Hungary");
        strCountries.add("Finland");
        strCountries.add("Bangladesh");
        strCountries.add("Cambodia");
        strCountries.add("Egypt");
        strCountries.add("Syria");
        strCountries.add("Jordan");
        strCountries.add("Lebanon");
        strCountries.add("Mongolia");
        strCountries.add("Pakistan");
        strCountries.add("Laos");
        strCountries.add("India");
        strCountries.add("Nepal");
        strCountries.add("Vietnam");
        strCountries.add("Iran");
        strCountries.add("Ukraine");
        strCountries.add("Bosnia and Herzegovina");
        strCountries.add("France");

        System.out.println("The random countries are: ");
        System.out.println(Arrays.toString(ListyCountries));
        Arrays.sort(ListyCountries);
        System.out.println();

        System.out.println("The random countries in order are: ");
        System.out.printf("%s", Arrays.toString(ListyCountries) + "\n");
        Arrays.sort(ListyCountries);
        System.out.println("\n");

        System.out.println("The random ArrayList countries are: ");
        System.out.println(strCountries);
        System.out.println();

        strCountries.add("Venezuela");
        Collections.sort(strCountries);
        System.out.println("The random ArrayList countries (with an added country) and in ascending order are: ");
        System.out.println(strCountries);
    }
}
