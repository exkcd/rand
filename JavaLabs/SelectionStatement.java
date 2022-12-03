import java.util.Scanner;

public class SelectionStatement {

    static int addition(int x, int y) {
        return x + y;
    }

    static int subtration(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num1 = in.nextInt();

        System.out.print("Please enter another number: ");
        int num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println(addition(num1, num2));
        }

        else if (num1 < num2) {
            System.out.println(subtration(num1, num2));
        }

        else {
            System.out.println(multiply(num1, num2));
        }
    }
}
