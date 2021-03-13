public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(1_000_000, 9.99, 12);
        System.out.printf("%.2f%n", payment);

        CreditPaymentService service2 = new CreditPaymentService();
        double payment2 = service.calculate(1_000_000, 9.99, 24);
        System.out.printf("%.2f%n", payment2);

        CreditPaymentService service3 = new CreditPaymentService();
        double payment3 = service.calculate(1_000_000, 9.99, 36);
        System.out.printf("%.2f", payment3);
    }

}
