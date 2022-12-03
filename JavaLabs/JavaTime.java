import java.util.Scanner;

public class JavaTime {
    public static void main(String[] args) {
        Scanner scannie = new Scanner(System.in); //scanner

        //Prompts
        System.out.println("Enter two different timestamps in military time and I'll give you their time differences!" +
                "\nPlease enter the first timestamp:");
        int time1 = scannie.nextInt();

        System.out.println("Please enter the second timestamp:");
        int time2 = scannie.nextInt();

        if (time2 > time1) {
            //Converted to all minutes
            int min1 = (time1 / 100 * 60) + (time1 % 100);
            int min2 = (time2 / 100 * 60) + (time2 % 100);

            int totalMin = min2 - min1;

            //Convert to hours and minutes
            int hourDiff = totalMin / 60;
            int minDiff = totalMin % 60;

            //Result
            System.out.println(hourDiff + " hours and " + minDiff + " minutes.");
        } else if (time1 > time2) {
            //Converted to all minutes
            int min1 = (time1 / 100 * 60) + (time1 % 100);
            int min2 = (time2 / 100 * 60) + (time2 % 100);

            // Add the remaining day from the first time to get total hours and then add the second time.

            // Total minutes in a day
            int dayTime = 2400;
            int dayMin = (dayTime / 100 * 60);

            //The difference of minutes from the time specified to the end of the day
            int day1 = dayMin - min1;

            //Total minutes from the remaining time and the next day
            int totalDay = day1 + min2;

            //Convert from hours to minutes
            int hourDiff = totalDay / 60;
            int minDiff = totalDay % 60;

            //Result
            System.out.println(hourDiff + " hours and " + minDiff + " minutes.");

        }
    }
}
