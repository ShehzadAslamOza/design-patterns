public class PaypalAdaptor implements PaymentGateway {
    private final Paypal paypal;

    public PaypalAdaptor(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void pay(double amount) {
        paypal.makePayment(amount);
    }
}
