public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double sum =  100_00_00;
        double interestRate = 9.99;
        double years = 1;
        double monthPay = service.calculate(sum, interestRate, years);
        System.out.println(monthPay);
    }
}