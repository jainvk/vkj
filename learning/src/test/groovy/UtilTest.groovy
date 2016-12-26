import org.hamcrest.core.Is

import static org.hamcrest.MatcherAssert.assertThat

/**
 * Created by jainvk on 12/25/16.
 */
class UtilTest {
    Util util = new Util();

    @org.junit.Test
    void correctlyCalculatedNumberOfTimesDividBy2ToGetLessThan2() {
        def divs = util.getNumberOfDivs(5)
        assertThat(divs, Is.is(2))

    }

    @org.junit.Test
    void correctlyCalculatedNumberOfTimesDividBy2ToGetLessThan2ForABigNumber() {
//        def startTime = System.currentTimeMillis()
////        for (int i = 0; i < 100000000; i++) {
////
////            def divs = permutation.getNumberOfDivs(123456789)
////        }
//        def endTime = System.currentTimeMillis()
////        println (endTime - startTime)
//
//         startTime = System.currentTimeMillis()
//        for (int i = 0; i < 100000000; i++) {
//
//            def divs = permutation.getNumberOfDivsImproved(123456789)
//        }
//         endTime = System.currentTimeMillis()
//        println (endTime - startTime)

        def divs = util.getNumberOfDivsImproved(123456789)
        assertThat(divs, Is.is(26))

    }
}
