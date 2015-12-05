package pl.edu.pg.ftims.hangman.utils;

import java.util.Random;

public class RandomUtils {
    public static int randomInRange(int min, int max) {
        Random random = new Random();

        return random.nextInt((max - min) + 1) + min;
    }
}
