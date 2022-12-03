import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scannie = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("=====================================");

        do {
            System.out.println();
            System.out.println("Please choose what temperature you'd like to convert from.");
            System.out.println("Fahrenheit (F), Celsius (C), Kelvin (K) or Quit (Q): ");

            String convertFrom = (scannie.next().toLowerCase());

            if (convertFrom.equals("q")) {
                goodbye();
            }

            System.out.println();
            System.out.println("Please choose what temperature you'd like to convert to.");
            System.out.println("Fahrenheit (F), Celsius (C), Kelvin (K) or Quit (Q): ");

            String convertTo = (scannie.next().toLowerCase());

            if (convertTo.equals("q")) {
                goodbye();
            }

            String getConvertType = String.join("_to_", convertFrom, convertTo);

            System.out.println();
            System.out.println("Please enter the temperature to convert: ");

            int value = scannie.nextInt();

            double c_to_f = (value * 1.8) + 32;
            double f_to_c = (value - 32) / 1.8;
            double f_to_k = (value - 32) / 1.8 + 273.15;
            double k_to_f = (value - 273.15) * 1.8  + 32;
            double c_to_k = (value + 273.15);
            double k_to_c = (value - 273.15);

            switch (getConvertType) {
                case "c_to_f" -> {
                    int result = (int) c_to_f;
                    System.out.println(value + "°C = " + result + "°F");
                }
                case "f_to_c" -> {
                    int result = (int) f_to_c;
                    System.out.println(value + "°F = " + result + "°C");
                }
                case "f_to_k" -> {
                    int result = (int) f_to_k;
                    System.out.println(value + "°F = " + result + "°K");
                }
                case "k_to_f" -> {
                    int result = (int) k_to_f;
                    System.out.println(value + "°K = " + result + "°F");
                }
                case "c_to_k" -> {
                    int result = (int) c_to_k;
                    System.out.println(value + "°C = " + result + "°K");
                }
                case "k_to_c" -> {
                    int result = (int) k_to_c;
                    System.out.println(value + "°K = " + result + "°C");
                }
            }
            System.out.println();
            System.out.println("Would you like to use the converter again? Type 'y' for yes or 'n' for no: ");
        } while (scannie.next().equalsIgnoreCase("y"));
        goodbye();
    }


    public static void goodbye() {
        System.out.println("Goodbye.");
        System.exit(0);
    }
}
