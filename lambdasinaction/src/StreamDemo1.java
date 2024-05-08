package lambdasinaction.appa.lambdasinaction.src;

import java.util.ArrayList;
import java.util.List;


public class StreamDemo1 {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<Product>();

        // Adding Products
        productList.add(new Product(1, "Sony mobile", 25000));
        productList.add(new Product(2, "Lenovo mobile", 15000));
        productList.add(new Product(3, "Nokia mobile", 10000));
        productList.add(new Product(4, "Samsung mobile", 40000));

        productList.stream().filter(x->(x.getPrice()>25000)).map(Product::getName).forEach(System.out::println);


    }
}