package LAB_5;

public abstract class Product {
    String name ;
    int stock_quantity;
    double  unit_price;
    public Product(String name, int stock_quantity, int unit_price) {
        this.name = name;
        this.stock_quantity = stock_quantity;
        this.unit_price = unit_price;
    }

    public  abstract double getTotal_price();
}
