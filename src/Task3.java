import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public String getSortedNums(List<String> numbers) {

        return (numbers.stream()
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .map(String::trim)
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(",")));
    }
}