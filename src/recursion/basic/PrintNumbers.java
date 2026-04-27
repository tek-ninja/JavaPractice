package recursion.basic;

public class PrintNumbers {
    void main() {
        printNumbers(9);
    }

    static void printNumbers(int n) {

        if (n == 0) {
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
        System.out.print(n + " ");
    }
}
