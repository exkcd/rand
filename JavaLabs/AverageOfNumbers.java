import java.util.*;

public class AverageOfNumbers {
    public static double avg(double sum, double divider) {
        return sum / divider;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double allSum = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print(i+1 + ". Please enter a number: ");
            double totalSum = in.nextDouble();
            allSum += totalSum;
        }

        System.out.printf("Total sum of all numbers is: %.1f", allSum);
        System.out.printf("\nThe average of all the numbers input is: %.1f", avg(allSum, 3));
    }
}
