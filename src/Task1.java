import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNames {
    public List<String> getOddNames(List<String> names) {

        return names.stream()
                .filter(name -> names.indexOf(name) % 2 != 0)
                .map(name -> names.indexOf(name) + ". " + name)
                .collect(Collectors.toList());
    }
}