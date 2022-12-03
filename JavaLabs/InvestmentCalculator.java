import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args){
        Scanner scannie = new Scanner(System.in);

        System.out.println("Welcome to the Investment Calculator!\n");

        System.out.println("Please type out your initial balance without the $ sign:");
        int principal = scannie.nextInt();


        System.out.println("\nPlease type out your initial rate (just type the integer, not 0.06):");
        float rate = scannie.nextFloat();
        rate = rate / 100;

        System.out.println("\nPlease type out how many months you want it compounded for:");
        int months = scannie.nextInt();


        System.out.println("\nInitial balance: $" + principal);
        System.out.println("Rate: " + rate * 100 + "%\n");

        for (int t = 1; t <= months; t++){
            double amt = principal * Math.pow(1 + rate/12, t);
            System.out.printf("After month %d: $%.2f\n", t, amt);
        }

    }
}
