import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice {
    void main() {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;
        int[] inter = new int[n - k + 1];
        for (int i = 0; i < n - k; i++) {
            inter[i] = arr[i];
        }
        for (int i = n - k - 1, count = 0; i < n; i++, count++) {
            arr[count] = arr[i];
        }


    }
}
