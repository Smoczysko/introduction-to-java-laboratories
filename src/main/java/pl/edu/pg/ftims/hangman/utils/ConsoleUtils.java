package pl.edu.pg.ftims.hangman.utils;

import java.io.Console;

public class ConsoleUtils {
    private static Console console = System.console();

    public static boolean isConsoleProper() {
        return console != null;
    }

    public static String readPlayerName() {
        if (console == null) {
            return null;
        }

        console.printf("Enter your name: ");
        String playerName = console.readLine();

        while (playerName.equals("")) {
            console.printf("You need to enter your name: ");
            playerName = console.readLine();
        }

        return playerName;
    }

    public static int readNumberOfTrials() {
        String userInput = "";
        int trials = 0;

        console.printf("Enter number of trials: ");

        do {
            userInput = console.readLine();

            try {
                trials = Integer.parseInt(userInput);
                if (trials < 1 || trials > 5) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                console.printf("You need to enter proper number of trials (integer in range of 1 to 5): ");

                userInput = "";
            }
        } while (userInput.equals(""));

        return trials;
    }
}
