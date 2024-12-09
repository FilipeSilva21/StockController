package services;

import controller.StockController;

public class  RemoveService {
    public void removeProduct(String getName, int Id) {
        StockController.stock.remove(Id);
       System.out.println("O produto removido foi um " + getName);
    }
}
