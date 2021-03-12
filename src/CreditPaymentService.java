public class CreditPaymentService {
    public double calculate(double credit, double percent, double months) {
        percent = percent/100/12;
        return credit * (percent  + percent / (Math.pow(1 + percent, months) - 1));
    }
}


//i – ежемесячная процентная ставка (рассчитывается по следующей формуле: годовая процентная ставка/100/12);