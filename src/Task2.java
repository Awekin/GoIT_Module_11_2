import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public List<String> getSortedNames(List<String> names2) {

        return names2.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList())
                .reversed();
    }
}