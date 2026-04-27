package recursion.Intermediate;

public class Power {
    void main() {
        System.out.println(power(2, 4));
        System.out.println(optimisedPower(2, 4));
    }

    static int power(int n, int x) {
        if (n == 0) {
            return 1;
        }
        return power(n - 1, x) * x;
    }

    static int optimisedPower(int n, int x) {
        if (n == 0) {
            return 1;
        }
        int half = power(n / 2, x);
        if (n % 2 == 0) {
            return half * half;
        }
        return half * half * x;
    }
}
