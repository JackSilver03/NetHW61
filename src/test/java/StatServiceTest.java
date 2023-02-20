import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatServiceTest {
    @Test
    public void shouldFindSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualDay = service.sumAllSales(sales);
        Assertions.assertEquals(expectedSum, actualDay);


    }

    @Test
    public void shoulFindAverageOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageOfSales = 15;
        int actualAverageOfSales = service.getAverageOfSales(sales);
        Assertions.assertEquals(expectedAverageOfSales, actualAverageOfSales);
    }

    @Test
    public void MonthOfMaxSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthOfMaxSale = 8;
        int actualMonthOfMaxSale = service.getMonthOfMaxSale(sales);
        Assertions.assertEquals(expectedMonthOfMaxSale, actualMonthOfMaxSale);
    }

    @Test
    public void MonthOfMinSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthOfMinSale = 9;
        int actualMonthOfMinSale = service.getMonthOfMinSale(sales);
        Assertions.assertEquals(expectedMonthOfMinSale, actualMonthOfMinSale);
    }

    @Test
    public void SumOfTheMonthsBelowTheAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumOfTheMonthsBelowTheAverage = 5;
        int actualSumOfTheMonthsBelowTheAverage = service.getSumOfTheMonthsBelowTheAverage(sales);
        Assertions.assertEquals(expectedSumOfTheMonthsBelowTheAverage, actualSumOfTheMonthsBelowTheAverage);
    }

    @Test
    public void SumOfTheMonthsBeforeTheAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumOfTheMonthsBeforeTheAverage = 5;
        int actualSumOfTheMonthsBeforeTheAverage = service.getSumOfTheMonthsBelowTheAverage(sales);
        Assertions.assertEquals(expectedSumOfTheMonthsBeforeTheAverage, actualSumOfTheMonthsBeforeTheAverage);
    }
}

