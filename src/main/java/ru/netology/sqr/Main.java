package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int amountSquare = service.calcSquareCount(1000, 2);
        if (amountSquare == -1) {
            System.out.println("Квадрат числа не может быть отрицательным");
        } else if (amountSquare == -2) {
            System.out.println("Границы диапазона заданы неверно: верхняя граница < нижней");
        } else if (amountSquare == 0) {
            System.out.println("Квадраты чисел не входят в заданный диапазон");
        } else {
            System.out.println(amountSquare);
        }
    }
}