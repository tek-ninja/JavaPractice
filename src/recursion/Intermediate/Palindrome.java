package recursion.Intermediate;

public class Palindrome {
    static String text = "Balaji";

    void main() {
        System.out.println(checkPalindrome(0, text.length() - 1, text.length()));
    }

    static boolean checkPalindrome(int start, int end, int n) {

        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return checkPalindrome(start + 1, end - 1, n);

    }
}
