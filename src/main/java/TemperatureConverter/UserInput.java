package TemperatureConverter;

import java.util.Scanner;

class UserInput {

    private Scanner inputScanner;

    char getUnit() {
        System.out.print("\nВыбери один из вариантов - [C]elsius или [F]ahrenheit: ");
        try {
            inputScanner = new Scanner(System.in);
            String userInput = this.inputScanner.nextLine();
            String userInputU = userInput.toUpperCase();
            char unit = userInputU.charAt(0);
            if (unit == 'C' || unit == 'F') {
                return unit;
            } else {
                System.out.println("Ты выбрал что-то не то, попробуй еще раз!");
                return this.getUnit();
            }
        } catch (Exception e) {
            System.out.println("Ты ничего не ввел!");
        }
        return this.getUnit();
    }

    double getValue() {
        System.out.print("\nВведи значение конвертируемой единицы измерения температуры: ");
        try {
            inputScanner = new Scanner(System.in);
            String userInput = inputScanner.nextLine();
            return Double.parseDouble(userInput.replace(",", "."));
        } catch (Exception e) {
            System.out.println("Ты не то вводишь! Необходимо ввести целое или дробное число!");
        } return this.getValue();
    }

    boolean doConvertAgain() {
        System.out.print("Хочешь еще раз? ( [Y]es / [N]o ) ");
        try {
            String playerInput = this.inputScanner.nextLine();
            playerInput = playerInput.toUpperCase();
            return playerInput.charAt(0) == 'Y';
        } catch (Exception e) {
            System.out.println("Ты ввел что-то не то, укажи \"Y\" или \"N\"!");
        }
        return this.doConvertAgain();
    }
}
