import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number:");
        Integer int1 = in.nextInt();

        System.out.println("Please enter a second number:");
        Integer int2 = in.nextInt();

        System.out.println("Please enter a third number:");
        Integer int3 = in.nextInt();

        if (int1 > int2 && int1 > int3) {
            System.out.println(int1 + " is the largest number.");
        } else if (int2 > int1 && int2 > int3) {
            System.out.println(int2 + " is the largest number.");
        } else if (int3 > int1 && int3 > int2) {
            System.out.println(int3 + " is the largest number.");
        } else {
            System.out.println("There is no larger number.");
        }
    }
}
