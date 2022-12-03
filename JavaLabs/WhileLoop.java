import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int product = 1;

        while (true) {
            System.out.print("Type in a number: ");

            int num = in.nextInt();

            if (num == 0) {
                System.out.println("This number is illegal.\n");
                System.exit(0);
                break;
            } else {
                System.out.println("Your number was: " + num + "\n");

                product = product * num;
            }
        }
        System.out.println("The final product is: " + product);
    }
}
