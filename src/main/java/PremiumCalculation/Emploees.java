package PremiumCalculation;

enum Emploees {

    WORKER(1,"Worker", 10),
    ASSISTANT(2,"Assistant director", 20),
    DIRECTOR(3,"Director", 50);

    private final int number;
    private final String name;
    private final int premiumPercent;

    Emploees(int number, String name, int premiumPercent) {
        this.number = number;
        this.name = name;
        this.premiumPercent = premiumPercent;
    }

    int getNumber() {
        return number;
    }

    String getName() {
        return name;
    }

    int getPremiumPercent() {
        return premiumPercent;
    }

    static String getEmploeesList() {
        StringBuilder builder = new StringBuilder();
        int strNum = 1;
        for (Emploees value : values()) {
            builder.append(strNum + ". \"").append(value.getName()).append("\" \n");
            strNum++;
        }
        return builder.toString();
    }
}
