package progression

import org.hamcrest.core.Is
import org.junit.Test

import static org.hamcrest.MatcherAssert.assertThat

/**
 * Created by jainvk on 12/26/16.
 */
class ProgressionTest {
    Progression progression = new Progression()

    @Test
    public void correctlyGetsNextValue() throws Exception {
        def nextValue = progression.nextValue()
        assertThat(nextValue, Is.is(0L))

        nextValue = progression.nextValue()
        assertThat(nextValue, Is.is(1L))

    }

    @Test
    public void correctlyGeneratesProgresson() throws Exception {

        def progressionList = progression.generate(10)

        println(progressionList)

    }
}
