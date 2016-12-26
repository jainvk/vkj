import org.hamcrest.core.Is

import static org.hamcrest.MatcherAssert.assertThat

/**
 * Created by jainvk on 12/25/16.
 */
class MatrixTest {
    Matrix matrix = new Matrix()

    @org.junit.Test
    public void correctlyCalculatesDotProduct() throws Exception {
        int[] a = [1,2,3,4,5]
        int[] b = [1,2,3,4,5]

        int[] dotProduct = matrix.dotProduct(a, b)

        int[] result = [1, 4, 9, 16, 25]

        assertThat(dotProduct, Is.is(result))


    }
}
