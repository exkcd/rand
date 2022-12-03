import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        unitConverter labsies = new unitConverter();
        labsies.Drivesies();

    }

    public void Drivesies() {
        unitConverter();
        seasonsGreetings();

    }

    public void unitConverter() {

        Scanner scannie = new Scanner(System.in); //scanner name will always be "scannie"

        double lb_to_kg = 0.45;
        double kg_to_lb = 2.2;
        double mi_to_km = 1.6;
        double km_to_mi = 0.62;

        System.out.println("Welcome to the Unit Converter! Please type in what you'd want to convert.\n" +
                "Please use abbreviations like kg, lb, etc."); //welcome message

        System.out.print("First conversion: ");
        String convertFrom = scannie.nextLine();

        System.out.print("Second conversion: ");
        String convertTo = scannie.nextLine();

        System.out.print("Value: ");
        double value = scannie.nextDouble();

        if (convertFrom.equals("kg") && convertTo.equals("lb")) {
            double result = value * kg_to_lb;
            System.out.println(result + " pounds.");
        } else if (convertFrom.equals("lb") && convertTo.equals("kg")) {
            double result = value * lb_to_kg;
            System.out.println(result + " kilograms");
        }
        if (convertFrom.equals("mi") && convertTo.equals("km")) {
            double result = value * mi_to_km;
            System.out.println(result + " kilometers.");
        } else if (convertFrom.equals("km") && convertTo.equals("mi")) {
            double result = value * km_to_mi;
            System.out.println(result + " miles.");
        } else {
            System.out.println("Wrong conversion factors.");
        }
    }

    public void seasonsGreetings() {
        Scanner scannie = new Scanner(System.in);

        System.out.println("Welcome to the Seasons Calendar! Type in a month by their number and I'll tell you what season it is.");

        System.out.print("Please type in a number: ");
        int monthNum = scannie.nextInt();

        if (monthNum == 1 || monthNum == 2 || monthNum == 3) {
            System.out.println("The seasons is winter.");
        } else if (monthNum == 4 || monthNum == 5 || monthNum == 6) {
            System.out.println("The season is spring");
        } else if (monthNum == 7 || monthNum == 8 || monthNum == 9) {
            System.out.println("The season is summer.");
        } else if (monthNum <= 0 || monthNum >= 13) {
            System.out.println("This is not a month number.");
        } else {
            System.out.println("The season is fall.");
        }
    }
}
