public class Main {
    public static void main(String[] args) {

        int credit = 1_000_000;
        double percent = 9.99;
        int[] months = {12, 24, 36};

        for (int month : months) {
            CreditPaymentService service = new CreditPaymentService();
            double monthlyPayment = service.calculate(credit, percent, month);
            System.out.printf("%.2f%n", monthlyPayment);
        }

    }

}


