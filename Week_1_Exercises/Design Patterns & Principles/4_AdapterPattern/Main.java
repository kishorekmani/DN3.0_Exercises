public class Main {
    public static void main(String[] args) {
        // Using PayPal through the adapter
        PayPalPayment payPalPayment = new PayPalPayment();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalPayment);
        payPalAdapter.processPayment(100.0);

        // Using Stripe through the adapter
        StripePayment stripePayment = new StripePayment();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripePayment);
        stripeAdapter.processPayment(200.0);
    }
}
