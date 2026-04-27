package recursion;

public class Fibonacci {
    void main() {

        printFibonacci(6, 0, 1);

    }

    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);

    }

    static void printFibonacci(int n, int a, int b) {
        if (n == 0) return;
        System.out.print(a + " ");
        printFibonacci(n - 1, b, a + b);

    }


}

