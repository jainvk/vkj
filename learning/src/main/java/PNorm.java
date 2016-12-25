/**
 * Created by jainvk on 12/25/16.
 */
public class PNorm {
    public double norm(double[] v, int p) {
        double sum = 0;
        for (double v1 : v) {
            sum += Math.pow(v1,p);
        }

        return Math.pow(sum, 1.0/p);
    }

    public double norm(double[] v) {
        return norm(v, 2);
    }
}
