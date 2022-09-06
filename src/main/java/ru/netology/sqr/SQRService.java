package ru.netology.sqr;

public class SQRService {

    public int calcSquare(int lowline, int upline) {
        int counter = 0;

        for (int x = 10; x <= 99; x++) {
            int square = x * x;
            if (square >= lowline ) {
                if (square <= upline) {
                    counter++;
                }
            }
        }
        return counter;
    }

}
