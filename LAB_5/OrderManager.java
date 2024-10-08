package LAB_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrderManager implements Comparator<Product> {
    public ArrayList<Product>product_list;
     OrderManager() {
        product_list = new ArrayList<>();
    }

    public void addProduct(Product p) {
        product_list.add(p);
    }
    public void removeProduct(Product p) {
        product_list.remove(p);
    }

    public void getalldata(){
        for(int i=0;i<product_list.size();i++){
            System.out.println(product_list.get(i).name+" "+product_list.get(i).unit_price+" "+product_list.get(i).stock_quantity+" "+product_list.get(i).getTotal_price());
        }
    }


    @Override
    public int compare(Product o1, Product o2) {
        int compareValue  = (int)o1.getTotal_price() - (int)o2.getTotal_price();
        if(compareValue==0){

            return o1.name.compareTo(o2.name);
        }
        else{
            return compareValue;
        }

    }
}
