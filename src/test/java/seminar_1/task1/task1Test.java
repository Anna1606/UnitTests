package seminar_1.task1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class task1Test {
    @Test
    public void testMethod() {
        assertEquals(5, 2 + 3);
    }

    @BeforeEach
    public void setup() {
        // Инициализация ресурсов
    }

    @AfterEach
    public void teardown() {
        // Очистка ресурсов
    }

    @BeforeAll
    public static void globalSetup() {
        // Инициализация, выполнится один раз перед началом тестирования
    }

    @AfterAll
    public static void globalTeardown() {
        // Очистка, выполнится в конце после всего класса тестирования
    }

    @Test
    @DisplayName("Тест суммирования")
    public void testSum() {
        assertEquals(5, 2 + 3);
    }

//    @Test
//    @Disabled
//    public void testMethod() {
//        // этот тест не должен быть запущен
//    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void testMethod(int argument) {
        assertTrue(argument > 0);
    }
}
