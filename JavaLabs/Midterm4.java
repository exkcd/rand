import java.util.Scanner;

public class Midterm4 {

    public static String smallerNum(double a, double b) {
        if (a < b) {
            return a + " is the smaller number.";
        } else if (a == b) {
            return "They are the same number!";
        } else {
            return b + " is the smaller number";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers and I'll tell you which is smaller!");
        System.out.print("\nPlease enter a number: ");

        double i = in.nextDouble();

        System.out.print("\nPlease enter another number: ");

        double j = in.nextDouble();

        System.out.println("\n" + smallerNum(i, j));
    }
}
