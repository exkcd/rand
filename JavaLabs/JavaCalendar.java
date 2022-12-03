import java.util.Scanner;

public class JavaCalendar {
    public static void main(String[] args) {
        Scanner scannie = new Scanner(System.in);

        String months = " Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec ";

        System.out.println("Give me a number 1-12, and I'll tell you what month that corresponds with.");
        System.out.println("Please type in a number 1-12:");
        int numDate = scannie.nextInt();

        if (numDate > 12){
            System.out.println("That number is too big!");
        }
        else if (numDate < 12) {
            System.out.println(months.substring(numDate * 4 - 3, numDate * 4));
        }
    }
}
