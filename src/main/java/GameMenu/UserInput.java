package GameMenu;

import java.util.Scanner;

class UserInput {

    static int inputMenuItem() {
        System.out.print("Выберите пункт меню: ");
        try {
            Scanner inputScanner = new Scanner(System.in);
            String userInput = inputScanner.nextLine();
            int menuItem = Integer.parseInt(userInput);
            return menuItem;
        } catch (Exception e) {
            System.out.println("Ты выбрал что-то не то, попробуй еще раз!");
            return inputMenuItem();
        }
    }

    static boolean approveExit() {
        System.out.print("Вы действительно хотите выйти? ( [Y]es / [N]o ) ");
        Scanner inputScanner = new Scanner(System.in);
        String playerInput = inputScanner.nextLine();
        playerInput = playerInput.toUpperCase();
        return playerInput.charAt(0) == 'N';
    }
}
