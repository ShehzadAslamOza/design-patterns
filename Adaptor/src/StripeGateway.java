public class StripeGateway implements PaymentGateway{
    final Stripe stripe;

    public StripeGateway(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void pay(double amount) {
        stripe.charge(amount);
    }
}
