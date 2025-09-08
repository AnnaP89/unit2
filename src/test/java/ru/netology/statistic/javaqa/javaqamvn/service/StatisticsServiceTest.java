package ru.netology.statistic.javaqa.javaqamvn.service;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        ru.netology.statistic.javaqa.javaqamvn.service.StatisticsService service = new ru.netology.statistic.javaqa.javaqamvn.service.StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxAtEnd() {
        ru.netology.statistic.javaqa.javaqamvn.service.StatisticsService service = new ru.netology.statistic.javaqa.javaqamvn.service.StatisticsService();

        long[] incomesInBillions = {1, 5, 8, 4, 5, 3, 8, 6, 11, 11, 35}; // 35 в конце
        long expected = 35;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}