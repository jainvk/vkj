import org.apache.commons.lang3.tuple.Pair
import org.hamcrest.core.Is

import static org.hamcrest.MatcherAssert.assertThat

/**
 * Created by jainvk on 12/24/16.
 */
class CounterTest {
    Counter counter = new Counter();

    @org.junit.Test
    public void incrementsCorrectly() throws Exception {
        StringBuilder s = new StringBuilder();

        s.append("Hello World")

        s.reverse()
        s.reverse()
        s.insert(1, "rr")
        println s

        println "done"

        int i1 = 42
        double d1 = i1
        i1 = d1

        print d1

        long i = 1L;
        for (int j = 0; j < 61; j++) {
            i <<= 1
        }
        println i
        println Math.pow(2,60L)

        println Long.toBinaryString(i)
        println Long.toBinaryString(Math.pow(2,60L))

        counter.increment()
        assertThat(counter.getCount(), Is.is(1))
        counter.increment(5)
        assertThat(counter.count, Is.is(6))

    }

    @org.junit.Test
    public void correctlySetsMinAndMaxValues() throws Exception {
        counter.increment()  //1
        counter.increment(5)  // 6
        counter.decrement(3)  //3
        counter.decrement(10)  //-7

        def minMaxPair = counter.getMinMax()
        assertThat(minMaxPair.getLeft(), Is.is(-7))
        assertThat(minMaxPair.getRight(), Is.is(6))
    }
}
