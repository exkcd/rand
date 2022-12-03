import java.util.Random;
import java.util.ArrayList;

public class Midterm2 {
    public static void main(String[] args) {
        Random randInt = new Random();

        ArrayList<String> msgList = new ArrayList<>();

        msgList.add("Please remember to hydrate!");
        msgList.add("Please take some time to relax.");
        msgList.add("Don't forget to practice self care!");
        msgList.add("Please remember to take some deep breaths.");

        System.out.println(msgList.get(randInt.nextInt(3)));

    }
}