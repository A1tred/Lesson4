package GameMenu;

class App {

    public static void main(String[] args) {
        ProgramLogic programLogic = new ProgramLogic(
                new UserInput(),
                new MainMenuLogic(),
                new AdditionalMenuLogic()
        );
        programLogic.startProgram();
    }
}
