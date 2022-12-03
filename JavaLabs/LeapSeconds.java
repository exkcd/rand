import java.util.Scanner;

public class LeapSeconds {
    public static void main(String[] args) {
        Scanner scannie = new Scanner(System.in);

        System.out.println("Type in a year and I'll tell you if it's a leap year or not!");
        System.out.println("Please type in a year:");
        double leapYear = scannie.nextInt();

        if (leapYear >= 1582 && ((leapYear % 4 == 0 && leapYear % 100 != 0 ) || (leapYear % 400 == 0)) || (leapYear < 1582 && (leapYear % 4 == 0 && leapYear % 100 != 0))) {
            System.out.println((int) leapYear + " is a leap year!");
        } else {
            System.out.println((int) leapYear + " is not a leap year.");
        }
    }
}
