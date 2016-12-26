import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by jainvk on 12/25/16.
 */
public class BirthDayParadox {

    public List<Birthday> generateRandomBirthDays(int p) {
        return IntStream.range(0, p).mapToObj(it -> this.generateRandomBirthDay()).collect(Collectors.toList());

    }

    private Birthday generateRandomBirthDay() {
        Random random = new Random();
        int month = random.nextInt(12)%12+1;
        int day = random.nextInt(30)%30+1;

        return new Birthday(month, day);
    }

    public Map<Birthday, Long> findFrequency(List<Birthday> birthDays) {
        return birthDays.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public long countFrequencyNonUnique(List<Birthday> birthDays) {
        return findFrequency(birthDays).entrySet().stream().filter(it->it.getValue()>=2).count();
    }

    public double getProbabilityOfTwoPersonHavingSameBirthDay(int numberOfPeople) {
        double counter = 0;
        for (int i = 0; i < 10000; i++) {
            List<Birthday> birthdays = generateRandomBirthDays(numberOfPeople);
            long countFrequencyNonUnique = countFrequencyNonUnique(birthdays);
            if (countFrequencyNonUnique > 0) counter++;
        }
//
//        IntStream.range(1,10000).map(it->generateRandomBirthDays(numberOfPeople)).map(this::countFrequencyNonUnique).filter(it->it > 0).
        return counter/10000;
    }
}

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Data
class Birthday {
    int month;
    int day;
}
