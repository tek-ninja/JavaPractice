import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {
    void main() {
        List<Integer> integerList = Arrays.asList(1, 2, 1, 4, 5, 5, 6);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = integerList.stream().filter(ele -> !seen.add(ele))
                .collect(Collectors.toSet());
        seen.forEach(System.out::println);
        System.out.println("==========");
        duplicates.forEach(System.out::println);

    }
}
