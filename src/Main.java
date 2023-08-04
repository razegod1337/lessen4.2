import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double sum = 100_00_00;
        double interestRate = 9.99;
        double[] years;
        years = new double[3];
        years[0] = 1;
        years[1] = 2;
        years[2] = 3;
        double monthPay = service.calculate(sum, interestRate, years[0]);
        double monthPayTwo = service.calculate(sum, interestRate, years[1]);
        double monthPayThree = service.calculate(sum, interestRate, years[2]);
        System.out.println(monthPay);
        System.out.println(monthPayTwo);
        System.out.println(monthPayThree);
    }
}