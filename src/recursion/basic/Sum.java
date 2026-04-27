package recursion.basic;

public class Sum {
    void main() {
        System.out.println(sumIntegers(10));
    }

    static int sumIntegers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumIntegers(n - 1);
    }

}
