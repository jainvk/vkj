import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<String> getAllPermutations(List<Character> p) {

        List<String> permutations = new ArrayList<>();
        if (p.size() == 0) {
            return permutations;
        }

        else if(p.size() == 1) {
            permutations.add(String.valueOf(p.get(0)));
            return permutations;
        } else {

            for (int i = 0; i < p.size(); i++) {
                Character thisChar = p.get(i);
                List<Character> newList = new ArrayList<>(p);
                newList.remove(thisChar);
                List<String> allPermutations = getAllPermutations(newList);
                List<String> newPermutations = new ArrayList<>();
                allPermutations.forEach(it -> newPermutations.add(thisChar + it));
                permutations.addAll(newPermutations);
            }
        }



        return permutations;
    }
}
