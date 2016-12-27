import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by jainvk on 12/26/16.
 */
public class FrequencyCalculator {
    public Map<String, Long> getFrequency(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
