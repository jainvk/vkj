/**
 * Created by jainvk on 12/26/16.
 */
class FrequencyCalculatorTest {
    FrequencyCalculator calculator = new FrequencyCalculator()

    @org.junit.Test
    public void correctlyPrintsFrequency() throws Exception {
        List<String> inputs = ["Hello", "Hi", "Hello", "Awesome", "Hello", "Hi"]
        println calculator.getFrequency(inputs)

    }
}
