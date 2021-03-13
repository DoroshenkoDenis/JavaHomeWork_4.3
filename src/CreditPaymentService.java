public class CreditPaymentService {
    public double calculate(int credit, double percent, int month) {
        double monthlyPercent = percent / 100 / 12;
        return credit * (monthlyPercent + monthlyPercent / (Math.pow(1 + monthlyPercent, month) - 1));
    }
}

//i – ежемесячная процентная ставка (рассчитывается по следующей формуле: годовая процентная ставка/100/12);

