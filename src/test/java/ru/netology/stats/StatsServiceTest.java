package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] incomesInBillions = {5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

    @Test
    void findMax() {
        StatsService service = new StatsService();
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxMonthlyIncomeAfterFeb() {
        StatsService service = new StatsService();
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}