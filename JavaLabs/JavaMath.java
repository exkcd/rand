import java.util.Scanner;

public class JavaMath {
    public static void main(String[] args) {
        Scanner scannie = new Scanner(System.in);

        // User input
        System.out.println("Enter one number:");
        float num1 = scannie.nextFloat();
        System.out.println("Enter another number: ");
        float num2 = scannie.nextFloat();

        float sum = num1 + num2; //addition
        float diff = num1 - num2; //subtraction
        float multie = num1 * num2; //multiplying
        float dividie = num1 / num2; //division
        float abs1 = Math.abs(num1); // absolute value
        float abs2 = Math.abs(num2);
        float absies = abs1 + abs2;
        float minnies = Math.min(num1, num2);
        float maxies = Math.max(num1, num2);


        //Output
        System.out.println("The sum of your numbers is: " + sum);
        System.out.println("The difference of your numbers is: " + diff);
        System.out.println("The product of your numbers is: " + multie);
        System.out.println("The average of your numbers is: " + dividie);
        System.out.println("The distance of your numbers is: " + absies);
        System.out.println("The smallest number is: " + minnies);
        System.out.println("The biggest number is: " + maxies);
    }
}
