import java.util.Scanner;

public class CountVowels {
    public int countVowels(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public boolean isVowel(char c) {
        String vowels = "aeiou";

        if (vowels.contains(Character.toString(c).toLowerCase())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        countVowels cc = new countVowels();
        System.out.println("Please type in a sentence: ");
        String phrase = in.nextLine();

        System.out.println("Vowel count: " + cc.countVowels(phrase));
    }
}
