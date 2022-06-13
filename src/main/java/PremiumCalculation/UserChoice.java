package PremiumCalculation;

import java.util.Scanner;

class UserChoice {

    static int inputPositionInList() {
        try {
            Scanner inputScanner = new Scanner(System.in);
            String userInput = inputScanner.nextLine();
            int choice = Integer.parseInt(userInput);
            return choice;
        } catch (Exception e) {
            System.out.println("Ты выбрал что-то не то, попробуй еще раз!");
            return inputPositionInList();
        }
    }

    static boolean calculateAgain() {
        Scanner inputScanner = new Scanner(System.in);
        String playerInput = inputScanner.nextLine();
        playerInput = playerInput.toUpperCase();
        return playerInput.charAt(0) == 'Y';
    }
}
