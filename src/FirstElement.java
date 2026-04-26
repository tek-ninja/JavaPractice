import java.util.Arrays;
import java.util.List;

public class FirstElement {
    void main() {
        List<String> names = Arrays.asList("Mike", "Sarah", "John", "Jessica");
        var name = names.stream().filter(i -> i.startsWith("J")).findFirst().orElse("Not Found");
        System.out.println(name);
    }
}
