public class CreditPaymentService {
    public int calculate(double sum, double interestRate, double years) {
        double percentMonth;
        percentMonth = interestRate / 1200;
        double month;
        month = years *12;
        double monthPay = sum * percentMonth/(1-Math.pow(1+percentMonth,- month));
        return (int) monthPay;
    }
}
