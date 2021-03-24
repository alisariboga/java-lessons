package homework;

import java.util.Random;

public class RandomNameGenerator {

    public int randomNumber(int i) {
        Random random = new Random(10000);
        i = random.nextInt();
        return i;
    }
}
