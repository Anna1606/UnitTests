package seminar_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;


public class PaymentProcessorMockTest {
    @Test
    public void testMakePaymentWithSuccessfulPayment() {

        // Создаем мок-объект PaymentGateway
        IPaymentGateway mockGateway = mock(IPaymentGateway.class);

        // Устанавливаем, что при вызове processPayment с любой суммой должен вернуться true
        when(mockGateway.processPayment(anyDouble())).thenReturn(true);

        // Создаем экземпляр PaymentProcessor, передавая мок-объект
        PaymentProcessor processor = new PaymentProcessor(mockGateway);

        // Вызываем метод makePayment с суммой 100.0
        boolean result = processor.makePayment(100.0);

        // Проверяем, что метод processPayment был вызван ровно один раз с любой суммой
        verify(mockGateway, times(1)).processPayment(anyDouble());

        // Проверяем результат, который должен быть true
        assertTrue(result); // JUnit
    }
}
