package ch.bbw.ds;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        double fahrenheitResult = 0;
        double celsiusResult = 0;
        Scanner askUnit = new Scanner(System.in);
        Scanner askQuantity = new Scanner(System.in);

        System.out.println("\nPlease tell me what you want to calculate:\n" +
                "[from celsius to fahrenheit] = 1\n" +
                "[from fahrenheit to celsius] = 2\n" +
                "[cancel] = 0");

        double result = askUnit.nextDouble();
        boolean done = false;
        while (result != 0 && !done) {
            if (result == 1) {
                Scanner howManyCelsius = new Scanner(System.in);
                System.out.println("How many degrees celsius?");
                double celsiusCount = howManyCelsius.nextDouble();
                fahrenheitResult = (celsiusCount * 9 / 5) + 32;
                System.out.println(celsiusCount + "°C are " + fahrenheitResult + "°F");
                done = true;

            } else if (result == 2) {
                Scanner howManyFahrenheit = new Scanner(System.in);
                System.out.println("How many degrees fahrenheit?");
                double fahrenheitCount = howManyFahrenheit.nextDouble();
                celsiusResult = (fahrenheitCount - 32) * 5 / 9;
                System.out.println(fahrenheitCount + "°F are " + celsiusResult + "°C");
                done = true;

            } else {
                System.out.println("Invalid, please enter 1 or 2");
            }
        }
        askUnit.close();
    }
}
