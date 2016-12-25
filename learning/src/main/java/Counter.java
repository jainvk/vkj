import lombok.Data;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Created by jainvk on 12/24/16.
 */
@Data
public class Counter {
    private int min;
    private int max;
    private int count;

    public void increment() {
        count++;
        if(max < count) max = count;

    }

    public void increment(int delta) {
        count += delta;
        if(max < count) max = count;
    }

    public void decrement() {
        count--;
        if(min > count) min = count;
    }

    public void decrement(int delta) {
        count -= delta;
        if(min > count) min = count;
    }

    public Pair<Integer, Integer> getMinMax() {
        return new ImmutablePair<>(min, max);
    }


}
