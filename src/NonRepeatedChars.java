import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedChars {
    void main() {
        String input = "stress";
        Character result = input.chars()
                .mapToObj(o -> (char) o)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(result);

    }
}
