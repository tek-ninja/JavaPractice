package prime;

public class SievePrime {
    void main() {
        int n = 150;
        int[] nums = new int[n];
        for (int i = 2; i * i <= n; i++) {
            if (nums[i] == 0) {
                for (int j = i * i; j < n; j += i) {
                    nums[j] = 1;
                }
            }

        }
        for (int i = 2; i < n; i++) {
            if (nums[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
