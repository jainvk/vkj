import org.hamcrest.core.Is

import static org.hamcrest.MatcherAssert.assertThat

/**
 * Created by jainvk on 12/25/16.
 */
class PNormTest {
    PNorm pnorm = new PNorm()

    @org.junit.Test
    public void correctlyCalculatesEuclideanNorm() throws Exception {
        double[] v = [4,3];
        def norm = pnorm.norm(v)
        assertThat(norm, Is.is(5d))
    }

    @org.junit.Test
    public void correctlyCalculates3Norm() throws Exception {
        double[] v = [1d,2d,3d, 1d,3d];
        def norm = pnorm.norm(v,3)
        println norm
        println norm.round(6)

        assertThat(norm.round(6), Is.is(4d))
    }
}
