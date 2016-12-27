package generic;

import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Created by jainvk on 12/26/16.
 */
public class GenericArray {
    Pair<String, Double>[] holdings;

    {
        holdings = new Pair[25];
        holdings[0] = new MutablePair<>("ORCL", 32.07);
    }
}
