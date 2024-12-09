package  controller;

import entity.Product;

import java.util.ArrayList;
import java.util.List;

public class StockController {
        public static final List<Product> stock = new ArrayList<>();

        public static List <Product> getStock() {
        return stock;
    }

        public int findById (int Id){
            for (int x = 0; x < stock.size(); x++) {
                if (stock.get(x).getId() == Id) {
                    return x;
                }
            }
            return 0;
        }  //throw new Error("Produto com Id " + Id + "não foi encontrado");


    public static String getName(String name) {
        for (Product product : StockController.stock) {
            if (product.getName().equals(name)) {
                return name;
            }
        }
        return null;
    }

}

