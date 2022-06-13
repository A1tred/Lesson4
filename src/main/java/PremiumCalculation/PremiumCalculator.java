package PremiumCalculation;

class PremiumCalculator {

    static int getEmploeePremium(int choice) {
        int result;
        final int premium = 1000000;
        if (choice == Emploees.WORKER.getNumber() || choice == Emploees.ASSISTANT.getNumber() || choice == Emploees.DIRECTOR.getNumber())
            switch (choice) {
                case 1:
                    System.out.println("\nПолучается вы - " + Emploees.WORKER.getName() + ". Что же, ожидаемо.");
                    result = (premium * Emploees.WORKER.getPremiumPercent()) / 100;
                    return result;
                case 2:
                    System.out.println("\nПолучается вы - " + Emploees.ASSISTANT.getName() + ". Неплохо, весьма неплохо.");
                    result = (premium * Emploees.ASSISTANT.getPremiumPercent()) / 100;
                    return result;
                case 3:
                    System.out.println("\nПолучается вы - " + Emploees.DIRECTOR.getName() + ". Ясно, очередной крохобор.");
                    result = (premium * Emploees.DIRECTOR.getPremiumPercent()) / 100;
                    return result;
            }
        System.out.println("Вас нет в списке! Вы кто такой?");
        return 0;
    }
}
