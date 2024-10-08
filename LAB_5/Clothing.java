package LAB_5;

public class Clothing extends Product {
    public final double interestRate = 0.10;

    public Clothing(String name, int stock_quantity, int unit_price) {
        super(name, stock_quantity, unit_price);
    }
    public double getTotal_price() {

        return unit_price+(unit_price)*interestRate;

    }
}
