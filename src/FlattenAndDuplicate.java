import java.util.Arrays;
import java.util.List;

public class FlattenAndDuplicate {
    void main() {
        var lists = Arrays.asList(Arrays.asList(1, 2, 35, 65, 34), Arrays.asList(23, 35, 67, 89, 3));
        List<Integer> refinedList = lists.stream().flatMap(List::stream).distinct().toList();
        refinedList.forEach(System.out::println);
    }
}
