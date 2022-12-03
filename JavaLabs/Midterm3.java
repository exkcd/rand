import java.util.Scanner;

public class Midterm3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("Please enter a number: ");

            double number = in.nextDouble();

            if (number == -3) {
                System.out.println("That number is forbidden.");
                break;
            } else {
                System.out.println("Your number was: " + number);
            }
        }
    }
}
