package LAB_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectronicsTest {
    Electronics electronics = new Electronics("zawad",2,200);

    @Test
   public  void test_1() {
        double expected_total_price = 200+(200)*.2;
        assertEquals(expected_total_price,electronics.getTotal_price(),230);
    }
    @Test
    public  void test_2() {
        double expected_total_price = 200+(200)*.4;
        assertEquals(expected_total_price,electronics.getTotal_price(),230);
    }
    @Test
    public  void test_3() {
        double expected_total_price = 200+(200)*.3;
        assertEquals(expected_total_price,electronics.getTotal_price(),230);
    }

}