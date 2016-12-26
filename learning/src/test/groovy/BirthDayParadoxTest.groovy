import org.hamcrest.core.Is

import static org.hamcrest.MatcherAssert.assertThat

/**
 * Created by jainvk on 12/25/16.
 */
class BirthDayParadoxTest {
    BirthDayParadox birthDayParadox = new BirthDayParadox()

    @org.junit.Test
    public void generatedRandom5BirthDays() throws Exception {
        def birthDays = birthDayParadox.generateRandomBirthDays(5)
        println( birthDays)
        assertThat(birthDays.size(), Is.is(5))
    }

    @org.junit.Test
    public void generatedRandom50BirthDays() throws Exception {
        def birthDays = birthDayParadox.generateRandomBirthDays(50)
        println( birthDays)
        assertThat(birthDays.size(), Is.is(50))
    }

    @org.junit.Test
    public void correctlyTestsEqualsOnBirthday() throws Exception {
        Birthday b1 = new Birthday(3,10)
        Birthday b2 = new Birthday(3,10)
        Birthday b3 = new Birthday(4,10)

        def equalsTrue = b1.equals(b2)
        def equalsTrue1 = b2.equals(b1)
        def equalsTrue2 = b1.equals(b1)
        def equalsFalse = b1.equals(b3)
        def equalsFalse2 = b2.equals(b3)
        def equalsFalse3 = b3.equals(b1)

        assertThat(equalsTrue, Is.is(true))
        assertThat(equalsTrue1, Is.is(true))
        assertThat(equalsTrue2, Is.is(true))
        assertThat(equalsFalse, Is.is(false))
        assertThat(equalsFalse2, Is.is(false))
        assertThat(equalsFalse3, Is.is(false))
    }

    @org.junit.Test
    public void correctlyCalculatesFrequency() throws Exception {
        Birthday b1 = new Birthday(3,10)
        Birthday b2 = new Birthday(3,10)
        Birthday b3 = new Birthday(4,10)

        List<Birthday> birthdayList = [b1, b2, b3]

        def frequency = birthDayParadox.findFrequency(birthdayList)
        println(frequency)
        assertThat(frequency.get(b1), Is.is(2l))
        assertThat(frequency.get(b3), Is.is(1l))
    }

    @org.junit.Test
    public void findFrequency5BirthDaysWithTwoOrMoreHavingSame() throws Exception {
        def birthDays = birthDayParadox.generateRandomBirthDays(50)
        def frequency = birthDayParadox.countFrequencyNonUnique(birthDays)

        println frequency
    }

    @org.junit.Test
    public void getProbabilityOfTwoPersonHavingSameBirthDay() throws Exception {
        for (int i = 5; i < 100; i+=5) {
            def probability = birthDayParadox.getProbabilityOfTwoPersonHavingSameBirthDay(i)
            println "" + (probability >= 0.5) + ": for " + i + " number of people in room, he probability that two people have same birth day is greater than 0.5"

        }

    }
}
