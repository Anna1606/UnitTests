package seminar_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddNumberTest {
    private EvenOddNumber oddNumber;

    @BeforeEach
    void setUp() {
        oddNumber = new EvenOddNumber();
    }

    @ParameterizedTest
    @CsvSource({"2, true", "3, false"})
    void testEvenOddNumber(int a, boolean expectedResult){
        boolean result = oddNumber.evenOddNumber(a);
        assertEquals(expectedResult,result);
    }

}
