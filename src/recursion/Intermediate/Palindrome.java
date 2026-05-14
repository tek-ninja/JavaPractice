package recursion.Intermediate;

public class Palindrome {
    static String text = "sas";

    void main() {
        System.out.println(checkPalindrome(0, text.length() - 1));
    }

    static boolean checkPalindrome(int start, int end) {

        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return checkPalindrome(start + 1, end - 1);

    }
}
