package ru.netology.sqr.PackagesLoops.services;

public class SQRService {

    public int squareCountingCalculator(int maxLimit, int minLimit) {
        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i <= maxLimit) && (minLimit <= i * i)) {
                quantity = quantity + 1;
            }


        }
        return quantity;
    }
}
