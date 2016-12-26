import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public List<String> getAllPermutations(List<Character> p) {
        List<String> permutations = new ArrayList<String>();
        if (p.size() == 0) {
            return permutations;
        } else if (p.size() == 1) {
            permutations.add(String.valueOf(p.get(0)));
            return permutations;
        } else {
            for (int i = 0; i < p.size(); i++) {
                Character thisChar = p.get(i);
                List<Character> newList = new ArrayList<Character>(p);
                newList.remove(thisChar);
                List<String> allPermutations = getAllPermutations(newList);
                List<String> newPermutations = new ArrayList<String>();
                allPermutations.forEach(it -> newPermutations.add(thisChar + it));
                permutations.addAll(newPermutations);
            }
        }
        return permutations;
    }
}