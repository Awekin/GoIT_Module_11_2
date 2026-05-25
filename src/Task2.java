import java.util.Comparator;
import java.util.List;

public class Task2 {
    public List<String> getSortedNames(List<String> names2) {

        return names2.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder()).toList();
    }
}