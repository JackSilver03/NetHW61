package ru.netology.stats;

public class StatsService {

    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sales[i] + sum;
        }
        return sum;
    }


    public int getAverageOfSales(int[] sales) {
        int averageOfSales=0;
        int sum = sumAllSales(sales);
        int length = sales.length;
        averageOfSales=sum / length;
        return averageOfSales;
    }

    public int getMonthOfMaxSale(int[] sales) {
        int maxSaleMonth=0;
        for (int i=0; i<sales.length; i++) {
            if (sales[i] >= sales[maxSaleMonth]) {
                maxSaleMonth=i;
            }
        }
        return maxSaleMonth+1;
    }

    public int getMonthOfMinSale(int[] sales) {
        int minSaleMonth=0;
        for (int i=0; i<sales.length; i++) {
            if (sales[i] <= sales[minSaleMonth]) {
                minSaleMonth=i;
            }
        }
        return minSaleMonth+1;
    }
    public int getSumOfTheMonthsBelowTheAverage(int[] sales) {
        int monthsBelowTheAverage = 0;
        int averageOfSales = getAverageOfSales(sales);
        for (int i=0; i<sales.length; i++) {
            if (sales [i] < averageOfSales) {
                monthsBelowTheAverage++;
            }
        }
        return monthsBelowTheAverage;
    }
    public int getSumOfTheMonthsBeforeTheAverage(int[] sales) {
        int monthsBeforeTheAverage = 0;
        int averageOfSales = getAverageOfSales(sales);
        for (int i=0; i<sales.length; i++) {
            if (sales [i] > averageOfSales)
                monthsBeforeTheAverage++;
        }
        return monthsBeforeTheAverage;
    }
}
