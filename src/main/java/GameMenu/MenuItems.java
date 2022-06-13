package GameMenu;

enum MenuItems {

    RETURN("Вернуться в главное меню"),
    GAME("Начать новую игру"),
    RESUME("Продолжить"),
    SETTINGS("Настройки"),
    EXIT("Выйти");

    private final String name;

    MenuItems(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    static String getMainMenuItems() {
        StringBuilder builder = new StringBuilder();
        MenuItems[] values = values();
        for (int i = 1; i < values.length; i++) {
            builder.append(i + ". ").append(values[i].getName()).append(" \n");
        }
        return builder.toString();
    }

    static String getReturnAndExit() {
        String builder = "1. " + MenuItems.RETURN.getName() + " \n" +
                "2. " + MenuItems.EXIT.getName() + " \n";
        return builder;
    }
}
