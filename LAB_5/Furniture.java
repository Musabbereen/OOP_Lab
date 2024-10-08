package LAB_5;

public class Furniture extends Product{
    public final double interestRate = 0.8;

    public Furniture(String name, int stock_quantity, int unit_price) {
        super(name, stock_quantity, unit_price);
    }

    @Override
    public double getTotal_price() {
        return unit_price+(unit_price)*interestRate;
    }
}
