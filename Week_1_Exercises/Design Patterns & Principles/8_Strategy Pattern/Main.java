public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("John Doe", "1234567890123456", "123", "12/25"));
        context.pay(100.00);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment("john.doe@example.com", "password"));
        context.pay(250.75);
    }
}
