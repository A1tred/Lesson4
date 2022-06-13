package GameMenu;

class AdditionalMenuLogic extends MenuLogic {

    static void additionalMenuAndUserInput() {
        System.out.println(MenuItems.getReturnAndExit());
        UserInput userInput = new UserInput();
        int choice = userInput.inputMenuItem();
        if (choice == 1 || choice == 2) {
            switch (choice) {
                case 1:
                    System.out.println("\nВы выбрали пункт №" + choice + " \"" + MenuItems.RETURN.getName() + "\".\n");
                    MainMenuLogic.mainMenuAndUserInput();
                    break;
                case 2:
                    System.out.println("\nВы выбрали пункт №" + choice + " \"" + MenuItems.EXIT.getName() + "\".\n");
                    break;
            }
        } else {
            System.out.println("В меню нет такого пункта. Пожалуйста, попробуйте еще раз.\n");
            additionalMenuAndUserInput();
        }
    }
}
