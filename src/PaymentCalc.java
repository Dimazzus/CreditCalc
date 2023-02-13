public class PaymentCalc {
    public int calculate(int amount, int months, double percent) {
        double monthPercent = (percent / months) / 100;
        double a = 1 + monthPercent;
        double b = months;
        double x = Math.pow(a, b);
        double monthlyPayment = amount * ((monthPercent * x) / (x -1));

        int pay = (int) monthlyPayment;

        return pay;
    }



}
