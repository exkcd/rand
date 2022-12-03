import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {

        while (true) {
            Random randInt = new Random();
            Scanner in = new Scanner(System.in);

            int _8ball = randInt.nextInt(21);

            System.out.println("Welcome to the magic 8 ball generator!");
            System.out.println("Please ask a question:");

            String response = in.nextLine();

            switch (_8ball) {
                case 1 -> System.out.println("As I see it, yes");
                case 2 -> System.out.println("It is certain");
                case 3 -> System.out.println("It is decidedly so");
                case 4 -> System.out.println("Most likely");
                case 5 -> System.out.println("Outlook good");
                case 6 -> System.out.println("Signs point to yes");
                case 7 -> System.out.println("Without a doubt");
                case 8 -> System.out.println("Yes");
                case 9 -> System.out.println("Yes - definitely");
                case 10 -> System.out.println("You may rely on it");
                case 11 -> System.out.println("Reply hazy, try again");
                case 12 -> System.out.println("Ask again later");
                case 13 -> System.out.println("Better not tell you now");
                case 14 -> System.out.println("Cannot predict now");
                case 15 -> System.out.println("Concentrate and ask again");
                case 16 -> System.out.println("Don't count on it");
                case 17 -> System.out.println("My reply is no");
                case 18 -> System.out.println("My sources say no");
                case 19 -> System.out.println("Outlook not so good");
                case 20 -> System.out.println("Very doubtful");
                default -> System.out.println("An error as occurred.");
            }

            System.out.println("Would you like to play again? (y/n)");
            String playAgain = in.nextLine();


            if (playAgain.equals("n")) {
                System.out.println("Goodbye.");
                System.exit(0);
            } else if (playAgain.equals("y")) {
                System.out.println();
                continue;
            } else {
                System.out.println("Unrecognised command. Exiting...");
                System.exit(0);
            }
        }

    }
}
