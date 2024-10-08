package LAB_5;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        OrderManager orderManager = new OrderManager();

        Electronics e1 = new Electronics("Shirt",4,210);
        Clothing c1 = new Clothing("Shirt",3,240);
        Furniture f1 = new Furniture("Table",7,1500);
        orderManager.addProduct(e1);
        orderManager.addProduct(c1);
        orderManager.addProduct(f1);

        Collections.sort(orderManager.product_list,orderManager);
        orderManager.getalldata();
    }
}
