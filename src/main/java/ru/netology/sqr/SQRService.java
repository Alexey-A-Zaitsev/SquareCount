package ru.netology.sqr;

public class SQRService {
    public int calcSquareCount(int lowerRangeLimit, int upperRangeLimit) {
        // задаём нижний и верхний предел диапазона вхождения квадратов
        int amount = 0;
        if (upperRangeLimit < 0) { // квадрат числа не может быть отрицательным
            amount = -1;
        } else if (lowerRangeLimit > upperRangeLimit) { // проверка логики: верхняя граница не может быть меньше нижней
            amount = -2;
        } else {
            for (int i = 10; i <= 99; i++) {
                if ((lowerRangeLimit <= (i * i)) & (upperRangeLimit >= (i * i)))
                    amount++;
                continue;
            }
        }
        return amount;
    }
}
