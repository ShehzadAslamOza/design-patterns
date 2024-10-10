public class Client {

    public static void main(String[] args) {

        // Get a payment gateway
        PaymentGateway paymentGateway = new StripeGateway(new Stripe());
        PaymentGateway paymentGateway1 = new PaypalAdaptor(new Paypal());

        double amount = 100.0;

        // Pay using payment gateway
        paymentGateway.pay(amount);
        paymentGateway1.pay(amount);
    }
}
