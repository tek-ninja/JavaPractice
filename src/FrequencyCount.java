import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount {
    void main() {
        List<String> stringList = Arrays.asList("Str1", "Str1", "Str1", "Str2", "Str2");
        Map<String, Long> frequencyCount = stringList.stream().collect(Collectors.
                groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyCount);

        String text = "This is an example program this program tells about the execution";
        Map<String, Long> strFrequencyCount = Arrays.stream(text.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(strFrequencyCount);
        Map<Character, Long> charFrequencyCount = text.replaceAll("\\s+", "").chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charFrequencyCount);
    }


}
