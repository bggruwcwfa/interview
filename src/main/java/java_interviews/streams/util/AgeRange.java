package java_interviews.streams.util;

import java.time.LocalDate;
import java.util.Random;

public class AgeRange {

    private final int from;
    private final int to;

    public AgeRange(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public LocalDate randomBirthDate() {
        int diffInDays = (to - from) * 365;
        int randomDays = new Random().nextInt(diffInDays);
        return LocalDate.now().minusYears(to).plusDays(randomDays);
    }

}
