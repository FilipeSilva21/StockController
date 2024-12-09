package services;

import controller.StockController;
import entity.Product;

import java.util.ArrayList;
import java.util.List;

public class AddService {
    public List <Product> stock = new ArrayList<>();

    public void addProduct(int Id, String name, int quantity, double price){
        Product product = new Product(Id, name, quantity, price);
        StockController.stock.add(product);
        System.out.println("Novo " + name + " cadastrado");
    }
}
