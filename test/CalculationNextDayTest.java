import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationNextDayTest {

    @Test
    void testIsLeapYear() {
        CalculationNextDay calculationNextDay = new CalculationNextDay();
        int year = 1;

        boolean result = calculationNextDay.isLeapYear(year);
        assertEquals(false,result);
    }
    @Test
    void testIsLeapYear1() {
        CalculationNextDay calculationNextDay = new CalculationNextDay();
        int year = 100;

        boolean result = calculationNextDay.isLeapYear(year);
        assertEquals(false,result);
    }
    @Test
    void testIsLeapYear2() {
        CalculationNextDay calculationNextDay = new CalculationNextDay();
        int year = 400;

        boolean result = calculationNextDay.isLeapYear(year);
        assertEquals(true,result);
    }
    @Test
    void testIsLeapYear3() {
        CalculationNextDay calculationNextDay = new CalculationNextDay();
        int year = 2000;

        boolean result = calculationNextDay.isLeapYear(year);
        assertEquals(true,result);
    }
    @Test
    void testIsLeapYear4() {
        CalculationNextDay calculationNextDay = new CalculationNextDay();
        int year = -400;

        boolean result = calculationNextDay.isLeapYear(year);
        assertEquals(false,result);
    }

    @Test
    void testIsThirtyDay(){
        CalculationNextDay calculationNextDay = new CalculationNextDay(1,3,2018);

        boolean result = calculationNextDay.isThirtyDay();
        assertEquals(false,result);
    }

    @Test
    void testIsThirtyDay2(){
        CalculationNextDay calculationNextDay = new CalculationNextDay(1,4,2018);

        boolean result = calculationNextDay.isThirtyDay();
        assertEquals(true,result);
    }
    @Test
    void testIsThirtyDay3(){
        CalculationNextDay calculationNextDay = new CalculationNextDay(1,11,2018);

        boolean result = calculationNextDay.isThirtyDay();
        assertEquals(true,result);
    }

    @Test
    void testNextDay(){
        int[] expected = {2,3,2018};
        CalculationNextDay calculationNextDay = new CalculationNextDay(1,3,2018);
        int[] result = calculationNextDay.nextDay();
        assertArrayEquals(expected,result);
    }
    @Test
    void testNextDay2(){
        int[] expected = {1,3,400};
        CalculationNextDay calculationNextDay = new CalculationNextDay(29,2,400);
        int[] result = calculationNextDay.nextDay();
        assertArrayEquals(expected,result);
    }
    @Test
    void testNextDay3(){
        int[] expected = {1,1,2020};
        CalculationNextDay calculationNextDay = new CalculationNextDay(31,12,2019);
        int[] result = calculationNextDay.nextDay();
        assertArrayEquals(expected,result);
    }
    @Test
    void testNextDay4() {
        int[] expected = {1, 1, 401};
        CalculationNextDay calculationNextDay = new CalculationNextDay(31, 12, 400);
        int[] result = calculationNextDay.nextDay();
        assertArrayEquals(expected, result);
    }
    @Test
    void testNextDay5() {
        int[] expected = {1, 5, 401};
        CalculationNextDay calculationNextDay = new CalculationNextDay(30, 4, 401);
        int[] result = calculationNextDay.nextDay();
        assertArrayEquals(expected, result);
    }
    void testNextDay6() {
        int[] expected = {1, 5, 401};
        CalculationNextDay calculationNextDay = new CalculationNextDay(30, 4, 401);
        int[] result = calculationNextDay.nextDay();
        assertArrayEquals(expected, result);
    }
}