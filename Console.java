import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    public static float readInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextFloat();
    }

    public static float readInput(String prompt, int lowLimit, int highLimit) {
        while (true) {
            System.out.print(prompt);

            try {
                input = scanner.nextFloat();

                if (input >= highLimit && input <= lowLimit)
                    break;

                System.out.print(errorMessage);
            } catch (InputMismatchException e) {
                System.out.println("Nederīga ievade. Lūdzu, ievadiet skaitli.");
                scanner.next(); // Consume the invalid input
            }
        }

        return input;
    }
}

