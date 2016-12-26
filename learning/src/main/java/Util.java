/**
 * Created by jainvk on 12/25/16.
 */
public class Util {

    public int getNumberOfDivs(int p) {
        int number = 0;
        while(p >= 2) {
            number++;
            p = p/2;
        }
        return number;
    }

    public int getNumberOfDivsImproved(int p) {
//        String s = Long.toBinaryString(p);
//        System.out.println(s);
//        return s.length()-1;
        int number = 0;
        while(p >= 2) {
            number++;
            p = p >> 1;
        }
        return number;
    }

}
