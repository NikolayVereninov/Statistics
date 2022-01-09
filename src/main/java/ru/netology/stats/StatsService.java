package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] salesStatistics) {

        int sum = 0;

        for (int item : salesStatistics) {
            sum += item;
        }

        return sum;
    }

    public int averageAmount(int[] salesStatistics) {
        return sumSales(salesStatistics) / salesStatistics.length;
    }

    public int numMonthMaxSales(int[] salesStatistics) {
        int monthMaxSales = salesStatistics[0];
        int numMonthSales = 0;
        int count = 0;

        for (int item : salesStatistics) {
            count++;
            if (monthMaxSales <= item) {
                monthMaxSales = item;
                numMonthSales = count;
            }
        }
        return numMonthSales;
    }

    public int numMonthMinSales(int[] salesStatistics) {
        int monthMinSales = salesStatistics[0];
        int numMonthSales = 0;
        int count = 0;

        for (int item : salesStatistics) {
            count++;
            if (monthMinSales >= item) {
                monthMinSales = item;
                numMonthSales = count;
            }
        }
        return numMonthSales;
    }

    public int monthsWithBelowAverageSales(int[] salesStatistics) {
        int salesAverageAmount = averageAmount(salesStatistics);
        int monthsWithBelowAverageSales = 0;

        for (int item : salesStatistics) {
            if (salesAverageAmount < item) {
                monthsWithBelowAverageSales++;
            }
        }
        return monthsWithBelowAverageSales;
    }

    public int monthsWithAboveAverageSales(int[] salesStatistics) {
        int salesAverageAmount = averageAmount(salesStatistics);
        int monthsWithAboveAverageSales = 0;

        for (int item : salesStatistics) {
            if (salesAverageAmount > item) {
                monthsWithAboveAverageSales++;
            }
        }
        return monthsWithAboveAverageSales;
    }

}