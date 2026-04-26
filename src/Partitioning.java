import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {
    void main() {
        List<Integer> nums = Arrays.asList(1, 2, 4, 6, 7, 889, 56, 24);
        Map<Boolean, List<Integer>> map = nums.stream().
                collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(map);

        List<Integer> list = nums.stream()
                .filter(i -> i % 2 == 0)
                .map(x -> x * 2).toList();

        System.out.println(list);

    }

}
