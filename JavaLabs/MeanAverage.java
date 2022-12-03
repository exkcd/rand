import java.util.*;

public class MeanAverage {
    public static double avg(double sum, double divider) {
        return sum / divider;
    }

    public static void main(String[] args) {
        Random randInt = new Random();

        double[] ListyBoi = new double[10];

        double allSum = 0;

        for (int i = 0; i < ListyBoi.length; i++) {
            ListyBoi[i] = randInt.nextDouble(99);
            allSum += ListyBoi[i];
        }

        System.out.println("The random array numbers are: ");
        System.out.printf("%s", Arrays.toString(ListyBoi) + "\n");
        System.out.print("The average value of the numbers are: ");
        System.out.println(avg(allSum, ListyBoi.length));
    }
}
