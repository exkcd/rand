import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i < 11; i++) {
            System.out.print("Enter a number: ");

            int num = in.nextInt();

            if (num == -6) {
                System.out.println("This number is forbidden.");
                System.out.println();
                break;
            } else {
                System.out.println("Your number was: " + num);
                System.out.println();

                sum = sum + num;
            }


        }
        System.out.println("The sum is: " + sum);
    }
}
