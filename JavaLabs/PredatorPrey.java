import java.util.Scanner;

public class PredatorPrey {
    public static void main(String[] args) {
        Scanner scannie = new Scanner (System.in);

        System.out.println("Please enter the ecosystem you're currently studying:");
        String ecosys = scannie.nextLine();

        System.out.println("Please enter the initial prey population of the ecosystem:");
        double preyPop = scannie.nextDouble();

        System.out.println("Please enter the initial predator population of the ecosystem:");
        double predPop = scannie.nextDouble();

        System.out.println("Please enter the rate at which prey birth exceeds natural death:");
        double a = scannie.nextDouble();

        System.out.println("Please enter the rate at which predation occurs in the ecosystem:");
        double b = scannie.nextDouble();

        System.out.println("Please enter the rate of predator death that exceeds births without food:");
        double c = scannie.nextDouble();

        System.out.println("Please enter the predator increase in the presence of food:");
        double d = scannie.nextDouble();

        System.out.println("Please enter the number of periods you would like to see:");
        int periods = scannie.nextInt();

        System.out.println("\nEcosystem: " + ecosys);
        System.out.println("Period  |  Prey Population  |  Predator Population");

        for (int i = 1; i <= periods; i++) {
            double newPreyPop = preyPop * (1 + a - b * predPop);
            double newPredPop = predPop * (1 - c + d * preyPop);
            preyPop = newPreyPop;
            predPop = newPredPop;

            System.out.printf("%4d %15d %20d \n", i, (int)preyPop, (int)predPop);
        }


    }
}
