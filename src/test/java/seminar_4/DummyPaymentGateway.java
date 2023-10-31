package seminar_4;

public class DummyPaymentGateway implements IPaymentGateway{
    @Override
    public boolean processPayment(double amount) {
        // Не выполняем никаких действий, просто фиктивный объект
        return true;
    }
}
