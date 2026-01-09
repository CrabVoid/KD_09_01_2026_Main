public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.print("|===> Hipotekārā kredīta kalkulators <===|\n");

            int totalCreditSum = (int)Console.readInput(
                "Ievadiet kredīta summu: ", 1_000, 1_000_000, "Kredīta summai jābūt robežās no 1'000 līdz 1'000'000\n"
            );

            float yearlyPercentageRate =  Console.readInput(
                "Ievadiet gada procentu likmi: ", 0, 30, "Procentu likmei jābūt robežās no 0 līdz 30\n"
            );

            int years = (int)Console.readInput(
                "Ievadiet periodu gados: ", 1, 30, "Periodam jābūt robežās no 1 līdz 30\n"
            );

            var mortgageCalculator = new MortgageCalculator();
            System.out.println("Ikmēneša maksājums: " + mortgageCalculator.calculate(totalCreditSum, yearlyPercentageRate, years) + " EUR");

            if (Console.readInput("Vai vēlaties turpināt? Jā[1]/Nē[0]: ") == 0)
                break;
        }

        return mortgageCalculator;
    }
}