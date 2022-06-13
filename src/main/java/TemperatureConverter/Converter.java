package TemperatureConverter;

class Converter {

    void convertTemperature(char unit, double value) {
        if (unit == 'C' || unit == 'F') {
            double result;
            switch (unit) {
                case 'C':
                    result = ( (value - 32) * 5 / 9 );
                    System.out.println("\nРезультат конвертации: " + value + " °F" + " = " + result + " °" + unit + "\n");
                case 'F':
                    result = ( (value * 9 / 5 ) + 32);
                    System.out.println("\nРезультат конвертации: " + value + " °С" + " = " + result + " °" + unit + "\n");
            }
        }
    }
}
