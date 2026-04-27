package recursion.Intermediate;

public class ReverseAString {
    static String text = "Balaji";

    void main() {
        System.out.println(reverse(text));
        System.out.println(reverse(text.length() - 1, new StringBuilder()));
    }

    static StringBuilder reverse(int n, StringBuilder builder) {
        if (n == 0) {
            return builder.append(text.charAt(0));
        }
        builder.append(text.charAt(n));
        return reverse(n - 1, builder);
    }

    static String reverse(String s) {
        if (s.isEmpty()) {
            return "";
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

}
