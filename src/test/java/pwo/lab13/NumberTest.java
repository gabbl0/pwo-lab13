package pwo.lab13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberTest {
    @ParameterizedTest
    @ValueSource(ints = { 1, 3, 5, 7, 15, 101 })
    void isOddTest(int number) {
        System.out.println("Nieparzystość: " + number);
        assertTrue(Number.isOdd(number));
    }
    void isEvenTest(int number) {
        System.out.println("Parzystość: " + number);
        assertTrue(Number.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "xx1x12x1x"})    
    void cont5DigTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.cont5Dig(str));
    }
}