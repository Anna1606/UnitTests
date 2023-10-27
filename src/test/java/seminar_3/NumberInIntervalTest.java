package seminar_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberInIntervalTest {
    private NumberInInterval number;

    @BeforeEach
    void setUp() {
        number = new NumberInInterval();
    }

    @ParameterizedTest
    @CsvSource({"26, true", "105, false"})
    void numberInInterval(int n, boolean expectedResult) {
        boolean result = number.numberInInterval(n);
        assertEquals(expectedResult, result);
    }
}
