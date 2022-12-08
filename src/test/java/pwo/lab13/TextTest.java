package pwo.lab13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TextTest {

    @ParameterizedTest
    @ValueSource(strings = { "aa234bb34sd", "1 2 3 4 5",
            "xx12x12x1x" })
    void cont5DigTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.cont5Dig(str));
    }

    @ParameterizedTest
    @ValueSource(strings = { "aa23bb34sd", "1 2 x 4 5",
            "xx1x12x1x" })
    void cont5DigTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.cont5Dig(str));
    }
}
