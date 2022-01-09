package ru.netology.stats;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    
    void shouldSumSales() {
        int[] salesStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int actual = service.sumSales(salesStatistics);

        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageAmount() {
        int[] salesStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int actual = service.averageAmount(salesStatistics);

        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumMonthMaxSales() {
        int[] salesStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int actual = service.numMonthMaxSales(salesStatistics);

        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumMonthMinSales() {
        int[] salesStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int actual = service.numMonthMinSales(salesStatistics);

        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthsWithBelowAverageSales() {
        int[] salesStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int actual = service.monthsWithBelowAverageSales(salesStatistics);

        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthsWithAboveAverageSales() {
        int[] salesStatistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int actual = service.monthsWithAboveAverageSales(salesStatistics);

        int expected = 5;
        assertEquals(expected, actual);
    }

}
