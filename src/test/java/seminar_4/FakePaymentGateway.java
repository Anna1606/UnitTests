package seminar_4;

import java.util.ArrayList;
import java.util.List;

public class FakePaymentGateway implements IPaymentGateway{
    private List<Double> paymentHistory = new ArrayList<>();

    @Override
    public boolean processPayment(double amount) {

        paymentHistory.add(amount);

        // Здесь может быть альтернативная логика обработки платежа, но она не выполняется.
        return true;
    }

    public List<Double> getPaymentHistory() {
        return paymentHistory;
    }
}
