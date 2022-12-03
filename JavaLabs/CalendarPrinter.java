import java.util.Scanner;
import java.time.*;

public class CalendarPrinter {
    static final int WIDTH = 20;

    public static void main(String[] args) {
        CalendarPrinter cp = new CalendarPrinter();
        cp.printCalendar();
    }

    public String spaces(int numSpaces) {
        return " ".repeat(Math.max(0, numSpaces));
    }

    public void printHeader(int mo, int yr) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String month = months[mo];
        month = month + " " + yr;
        int leadSpaces = (WIDTH - month.length()) / 2;
        System.out.println("\n" + spaces(leadSpaces) + month);
        System.out.println("Su Mo Tu We Th Fr Sa");
    }

    public void printCalendar() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a month number 1-12:");
        int month = in.nextInt();

        System.out.println("Please enter a year number:");
        int year = in.nextInt();

        int day = 1;

        int weekday = java.time.LocalDate.of(year, month, 1).getDayOfWeek().getValue();
        LocalDate date = LocalDate.of(year, month, day);
        int lengthOfMonth = date.lengthOfMonth();
        printHeader(month - 1, year);
        printWeek(weekday, lengthOfMonth);

    }

    public void printWeek(int weekday, int daysInMonth) {
        if (weekday % 7 != 0 ) {
            System.out.print(spaces(3 * weekday));
            for (int dayOfMonth = 1; dayOfMonth <= daysInMonth; ) {
                for (weekday = weekday % 7; weekday <= 6 && (dayOfMonth <= daysInMonth); weekday++) {
                    System.out.printf("%2d ", dayOfMonth);
                    dayOfMonth++;
                }
                System.out.println();
            }
        }
        else {
            for (int dayOfMonth = 1; dayOfMonth <= daysInMonth; ) {
                for (weekday = weekday % 7; weekday <= 6 && (dayOfMonth <= daysInMonth); weekday++) {
                    System.out.printf("%2d ", dayOfMonth);
                    dayOfMonth++;
                }
                System.out.println();
            }
        }

    }
}
