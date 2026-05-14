import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HandlingDuplicates {
    void main() {
        List<User> users = Arrays.asList(new User("Balaji", "Buchi"),
                new User("Surya", "Hyderabad"),
                new User("Charan", "Hyderabad"),
                new User("Kit Harrington", "London"));

        Map<String, String> map = users.stream().
                collect(Collectors.toMap(User::getLocation, User::getName,
                        (existing, replacement) -> existing));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key :" + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}

class User {
    private String location;
    private String name;

    public User(String name, String location) {
        this.location = location;
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
