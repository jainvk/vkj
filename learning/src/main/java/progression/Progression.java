package progression;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by jainvk on 12/26/16.
 */
@NoArgsConstructor
@AllArgsConstructor
public class Progression {
    private long current;


    public long nextValue() {
        long answer = current;
        advance();
        return answer;
    }

    private long advance() {
        return current++;
    }


    public List<Long> generate(int n) {
        return IntStream.range(0,n).mapToObj(it-> nextValue()).collect(Collectors.toList());
    }
}
