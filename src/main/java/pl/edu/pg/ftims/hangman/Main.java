package pl.edu.pg.ftims.hangman;

import pl.edu.pg.ftims.hangman.utils.ConsoleUtils;

public class Main {
    public static void main(String[] args) {
        if (!ConsoleUtils.isConsoleProper()) {
            System.out.println("Good buy - sorry, you have incorrect console!");
            return;
        }

        String playerName = ConsoleUtils.readPlayerName();
        System.out.println("Welcome, " + playerName + "!");

        int numberOfTrials = ConsoleUtils.readNumberOfTrials();
        System.out.println("Number of trials: " + numberOfTrials);
    }
}
