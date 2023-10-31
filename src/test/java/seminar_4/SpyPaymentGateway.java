package seminar_4;

public class SpyPaymentGateway implements IPaymentGateway{
    private int processPaymentCallCount = 0;

    @Override
    public boolean processPayment(double amount) {

        processPaymentCallCount++;

        // Возвращаем true, как настоящий платежный шлюз
        return true;
    }

    public int getProcessPaymentCallCount() {
        return processPaymentCallCount;
    }
}
