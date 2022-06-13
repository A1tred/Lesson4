package PremiumCalculation;

class Program {

    UserChoice userChoice;

    Program(UserChoice userChoice) {
        this.userChoice = userChoice;
    }

    void startProgram() {
        System.out.println("\nДобро пожаловать в Калькулятор премии.\n");
        System.out.println("Выбеоите вашу должность из списка:");
        System.out.println(Emploees.getEmploeesList());
        System.out.print("Ваша должность (номер в списке): ");
        System.out.println("Ваша премия составляет: " + PremiumCalculator.getEmploeePremium(UserChoice.inputPositionInList()) + " казахстанских тенге.");
        System.out.print("Посмотрим чужие премии? ( [Y]es / [N]o ) ");
        if (UserChoice.calculateAgain()) {
            System.out.println();
            startProgram();
        }
    }
}
