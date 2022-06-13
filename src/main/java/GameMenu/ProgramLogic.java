package GameMenu;

class ProgramLogic {

    UserInput userInput;
    MainMenuLogic mainMenuLogic;
    AdditionalMenuLogic additionalMenuLogic;

    ProgramLogic(UserInput userInput, MainMenuLogic mainMenuLogic, AdditionalMenuLogic additionalMenuLogic) {
        this.userInput = userInput;
        this.mainMenuLogic = mainMenuLogic;
        this.additionalMenuLogic = additionalMenuLogic;
    }

    void startProgram() {
        System.out.println("\nДобро пожаловать в \"Какую-то игру\"!");
        System.out.println();
        mainMenuLogic.mainMenuAndUserInput();
        if (userInput.approveExit()) {
            System.out.println();
            startProgram();
        } else {
            System.out.println("\nВсего доброго и до новых встреч на просторах \"Какой-то игры\"");
        }
    }
}
