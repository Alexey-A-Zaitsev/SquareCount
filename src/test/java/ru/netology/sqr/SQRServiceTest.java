package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void testValuesWithinRange() {
        // значения квадратов входят в заданный диапазон
        SQRService service = new SQRService();
        int lowerRangeLimit = 100;
        int upperRangeLimit = 300;
        int expected = 8;

        int actual = service.calcSquareCount(lowerRangeLimit, upperRangeLimit);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testRangeLimitsBelowTheFirstSqrValue() {
        // Заданные границы диапазона меньше, чем значение квадрата ПЕРВОГО числа последовательности
        SQRService service = new SQRService();
        int lowerRangeLimit = 10;
        int upperRangeLimit = 99;
        int expected = 0;

        int actual = service.calcSquareCount(lowerRangeLimit, upperRangeLimit);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testRangeLimitsAboveTheLastSqrValue() {
        // Заданные границы диапазона меньше, чем значение квадрата ПОСЛЕДНЕГО числа последовательности
        SQRService service = new SQRService();
        int lowerRangeLimit = 10_000;
        int upperRangeLimit = 99_000;
        int expected = 0;

        int actual = service.calcSquareCount(lowerRangeLimit, upperRangeLimit);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncorrectRangeLimits() {
        // Некорректно заданы границы диапазона: значение верхнего предела < нижнего
        SQRService service = new SQRService();
        int lowerRangeLimit = 1000;
        int upperRangeLimit = 2;
        int expected = -2;

        int actual = service.calcSquareCount(lowerRangeLimit, upperRangeLimit);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void negativeRangeLimits() {
        // Границы диапазона заданы в отрицательной области
        SQRService service = new SQRService();
        int lowerRangeLimit = -200;
        int upperRangeLimit = -300;
        int expected = -1;

        int actual = service.calcSquareCount(lowerRangeLimit, upperRangeLimit);

        Assertions.assertEquals(expected, actual);

    }
}
