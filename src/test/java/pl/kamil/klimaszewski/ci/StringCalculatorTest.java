package pl.kamil.klimaszewski.ci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    StringCalculator calculator = new StringCalculator();

    @Test
    public void shouldReturnNullForEmptyString() {
        int sum = calculator.sum("");

        assertEquals(0, sum);
    }

    @Test
    public void shouldReturnTheSameNumberIfThereIsOnlyOne() {
        int sum = calculator.sum("5");

        assertEquals(5, sum);
    }

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        int sum = calculator.sum("2,4");

        assertEquals(6, sum);
    }

    @Test
    public void shouldCountSumOfMoreThanTwoNumbers() {
        int sum = calculator.sum("1,2,3,4");

        assertEquals(10, sum);
    }

    @Test
    public void shouldIgnoreNegativeNumbers() {
        int sum = calculator.sum("1,2,-3");

        assertEquals(3, sum);
    }
}
