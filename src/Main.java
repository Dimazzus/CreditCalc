public class Main {
    public static void main(String[] args) {
        PaymentCalc service = new PaymentCalc();
        /*int amount = 1_000_000;
        double percent = 9.99;
        int months = 12;
        int result = service.calculate(amount, months, percent);
        System.out.println(result);*/

        System.out.println();
        System.out.println("Кредит на 1 год. Ежемесячный платёж:");
        System.out.println(service.calculate(1000000, 12, 9.99) + " рублей");

        System.out.println();
        System.out.println("Кредит на 2 года. Ежемесячный платёж:");
        System.out.println(service.calculate(1000000, 24, 9.99) + " рублей");

        System.out.println();
        System.out.println("Кредит на 3 года. Ежемесячный платёж:");
        System.out.println(service.calculate(1000000, 36, 9.99) + " рублей");

    }

}
