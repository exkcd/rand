import java.util.Scanner;

public class PalindromeFun {
    public static void main(String[] args) {
        PalindromeFun pf = new PalindromeFun();
        pf.testPalindrome();
    }

    public String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public boolean isPalindrome(String fixString) {
        fixString = fixString.replaceAll("[^a-zA-Z]", "").toLowerCase();

        return reverseString(fixString).equals(fixString);
    }

    public String reverseWords(String str) {
        int idx = str.indexOf(" ");

        if (idx == -1)
            return str;

        return reverseWords(str.substring(idx + 1)) + " " + str.substring(0, idx);
    }

    public boolean isPalindromeWords(String fixString) {
        fixString = fixString.replaceAll("[^a-zA-Z]", " ").toLowerCase();

        if (fixString.contains(" ") && reverseWords(fixString).equals(fixString)) {
            return true;
        } else {
            return false;
        }
    }

    public void testPalindrome() {
        Scanner in = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("Please type in a sentence to be reversed or press 'q' to quit:");
            str = in.nextLine();

            if (str.equals("q")) {
                break;
            }

            String reversed = reverseWords(str);
            if (isPalindrome(str)) {
                System.out.println("'" + str + "'" + " is a palindrome!");
            } else if (isPalindromeWords(reversed)) {
                System.out.println("'" + str + "'" + " is a palindrome sentence!");
            } else {
                System.out.println("'" + str + "'" + " is not a palindrome.");
            }
        }
        System.out.println("Goodbye.");
    }
}
