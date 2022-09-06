package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test

    public void calcSquareTest() {
        SQRService service = new SQRService();

        int actual = service.calcSquare(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcSquareUnderLowline() {
        SQRService service = new SQRService();

        int actual = service.calcSquare(199, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcSquareAboveLowline() {
        SQRService service = new SQRService();
        int actual = service.calcSquare(201, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void calcSquareAboveUpline() {
        SQRService service = new SQRService();

        int actual = service.calcSquare(200, 301);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcSquareUnderUpline() {
        SQRService service = new SQRService();

        int actual = service.calcSquare(200, 299);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }


}