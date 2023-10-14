package pro.sky.dz13calculatornik.servise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.dz13calculatornik.TestUtils;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceParametrizedTest {

    public final CalculatorService calculatorService = new CalculatorService();

    public static Stream<Arguments> plusParams(){
        return Stream.of(
            Arguments.of("2", "2", "2 + 2 = 4"), //Сделал один раз так для примера
            Arguments.of("66", "72", TestUtils.formatResult(66, 72, "+", String.valueOf(138))),
            Arguments.of("6", "8", TestUtils.formatResult(6, 8, "+", String.valueOf(14))),
            Arguments.of("15", "-25", TestUtils.formatResult(15, -25, "+", String.valueOf(-10)))
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    void plus(int num1, int num2, String result) {
        assertEquals(result, calculatorService.plus(num1, num2));
    }

    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of("2", "2", "2 - 2 = 0"), //Сделал один раз так для примера
                Arguments.of("66", "72", TestUtils.formatResult(66, 72, "-", String.valueOf(-6))),
                Arguments.of("8", "2", TestUtils.formatResult(8, 2, "-", String.valueOf(6))),
                Arguments.of("15", "-25", TestUtils.formatResult(15, -25, "-", String.valueOf(40)))
        );

    }
    @ParameterizedTest
    @MethodSource("minusParams")
    void minus(int num1, int num2, String result) {
            assertEquals(result, calculatorService.minus(num1, num2));

    }


    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of("2", "2", "2 * 2 = 4"), //Сделал один раз так для примера
                Arguments.of("66", "72", TestUtils.formatResult(66, 72, "*", String.valueOf(4752))),
                Arguments.of("8", "2", TestUtils.formatResult(8, 2, "*", String.valueOf(16))),
                Arguments.of("15", "-25", TestUtils.formatResult(15, -25, "*", String.valueOf(-375)))
        );
    }
    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiply(int num1, int num2, String result) {
        assertEquals(result, calculatorService.multiply(num1, num2));
    }

    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of("2", "2", "2 / 2 = 1.0"), //Сделал один раз так для примера
                Arguments.of("66", "72", TestUtils.formatResult(66, 72, "/", String.valueOf((double) 66 / 72))),
                Arguments.of("8", "2", TestUtils.formatResult(8, 2, "/", String.valueOf((double) 8 / 2))),
                Arguments.of("15", "-25", TestUtils.formatResult(15, -25, "/", String.valueOf((double) 15 / -25)))
        );
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void divide(int num1, int num2, String result) {
        assertEquals(result, calculatorService.divide(num1, num2));
    }
}
