package GameMenu;

class MainMenuLogic extends MenuLogic {

    private static final String name = "Главное меню";

    static void mainMenuAndUserInput() {
        System.out.println(name + ":\n");
        System.out.println(MenuItems.getMainMenuItems());
        UserInput userInput = new UserInput();
        int choice = userInput.inputMenuItem();
        if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
            switch (choice) {
                case 1:
                    System.out.println("\nВы выбрали пункт №" + choice + " \"" + MenuItems.GAME.getName() + "\".\n");
                    AdditionalMenuLogic.additionalMenuAndUserInput();
                    break;
                case 2:
                    System.out.println("\nВы выбрали пункт №" + choice + " \"" + MenuItems.RESUME.getName() + "\".\n");
                    AdditionalMenuLogic.additionalMenuAndUserInput();
                    break;
                case 3:
                    System.out.println("\nВы выбрали пункт №" + choice + " \"" + MenuItems.SETTINGS.getName() + "\".\n");
                    AdditionalMenuLogic.additionalMenuAndUserInput();
                    break;
                case 4:
                    System.out.println("\nВы выбрали пункт №" + choice + " \"" + MenuItems.EXIT.getName() + "\".\n");
                    break;
            }
        } else {
            System.out.println("В меню нет такого пункта. Пожалуйста, попробуйте еще раз.\n");
            mainMenuAndUserInput();
        }
    }
}
