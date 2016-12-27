package generic;

/**
 * Created by jainvk on 12/26/16.
 */
public class GenericDemo {
    public static <T> void reverse(T[] data) {
        int low = 0, high = data.length - 1;
        while(low < high) {
            T temp = data[low];
            data[low++] = data[high];
            data[high--] = temp;
        }
    }

}
