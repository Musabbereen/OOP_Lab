package LAB_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {
    OrderManager o = new OrderManager();
    @Test
    void test_1(){
        Furniture f = new Furniture("Table",3,100);
        Furniture f2 = new Furniture("Chair",6,200);
        assertEquals("EVEN",o.compare(f,f2));
    }

}