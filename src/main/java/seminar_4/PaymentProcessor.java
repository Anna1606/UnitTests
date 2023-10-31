package seminar_4;

public class PaymentProcessor {
    private IPaymentGateway gateway;

    public PaymentProcessor(IPaymentGateway gateway) {
        this.gateway = gateway;
    }

    public boolean makePayment(double amount) {
        return gateway.processPayment(amount);
    }
}
