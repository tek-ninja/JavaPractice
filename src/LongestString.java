
import java.util.Arrays;
import java.util.Comparator;

public class LongestString {
    String text = "This is an example program this program tells about the execution";

    void main() {
        var result = Arrays.stream(text.split("\\s+")).max(Comparator.comparing(String::length)).get();
        System.out.println(result);
    }
}
