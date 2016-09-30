package Game;

import java.util.Random;

/**
 * Created by kunwar on 19-09-2016.
 */
public class Util {
    private static Random random = new Random();

    public static int randomInt(int lowerLimit, int uppperLimit) {
        return random.nextInt(uppperLimit - lowerLimit) + lowerLimit;
    }

    public static int randomInt(int upperLimit) {
        return Util.randomInt(0, upperLimit);
    }
}


