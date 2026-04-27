package recursion;

public class factorial {
    void main() {
        System.out.println(fact(5));
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
