package TemperatureConverter;

class Program {

    private final Converter converter = new Converter();
    private final UserInput userInput = new UserInput();

    void startProgram() {
        System.out.println("\nДобро пожаловать в Конвертер температур.");
        System.out.print("\nВ какую единицу измерения температуры будем конвертировать?");
        char unit = this.userInput.getUnit();
        double value = this.userInput.getValue();
        this.converter.convertTemperature(unit, value);
        if (this.userInput.doConvertAgain()) {
            System.out.println();
            startProgram();
        }
    }
}
