package pro.sky.dz13calculatornik.servise;

import org.junit.jupiter.api.Test;
import pro.sky.dz13calculatornik.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void greeting_success() {
        //Подготовка ожидаемого результата
        String expectedMessage = "Добро пожаловать в калькулятор!";

        //Начало теста
        String actualMessage = calculatorService.greeting();
        assertEquals(expectedMessage, actualMessage);
    }
    @Test
    void plus_success() {
        //Подготовка входных данных
        int num1 = 2;
        int num2 = 7;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "+", String.valueOf(num1 + num2));

        //Начало теста
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void plus_success2() {
        //Подготовка входных данных
        int num1 = 47;
        int num2 = 15;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "+", String.valueOf(num1 + num2));

        //Начало теста
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus_success() {
        //Подготовка входных данных
        int num1 = 10;
        int num2 = 2;
        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "-", String.valueOf(num1 - num2));

        //Начало теста
        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus_success2() {
        //Подготовка входных данных
        int num1 = 11;
        int num2 = 22;
        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "-", String.valueOf(num1 - num2));

        //Начало теста
        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply_success() {
        //Подготовка входных данных
        int num1 = 24;
        int num2 = 5;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "*", String.valueOf(num1 * num2));

        //Начало теста
        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply_success2() {
        //Подготовка входных данных
        int num1 = -15;
        int num2 = 45;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "*", String.valueOf(num1 * num2));

        //Начало теста
        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void divide_success() {
        //Подготовка входных данных
        int num1 = 114;
        int num2 = 25;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "/", String.valueOf((double) num1 / num2));

        //Начало теста
        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_success2() {
        //Подготовка входных данных
        int num1 = 37;
        int num2 = 75;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "/", String.valueOf((double) num1 / num2));

        //Начало теста
        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void divide_withException() {
        //Подготовка входных данных
        int num1 = 22;
        int num2 = 0;

        //Подготовка ожидаемого результата
        String expectedMessage = "На ноль делить нельзя!";

        //Начало теста
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculatorService.divide(num1, num2)
        );
        assertEquals(expectedMessage, exception.getMessage());
    }
}