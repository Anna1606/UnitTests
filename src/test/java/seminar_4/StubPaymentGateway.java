package seminar_4;

public class StubPaymentGateway implements IPaymentGateway{
    @Override
    public boolean processPayment(double amount) {
        // Имитация обработки платежа
        if (amount > 0) {
            return true; // Успешный платеж
        } else {
            return false; // Неуспешный платеж
        }
    }
}
