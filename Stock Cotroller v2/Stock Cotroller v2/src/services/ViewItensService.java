package services;

import controller.StockController;
import entity.Product;

public class ViewItensService {

    public void viewQuantity(int Id) {
        for (Product product : StockController.getStock()){
            if (product.getId() == Id) {
                System.out.println("Existem " + product.getQuantity() + " unidades de " + product.getName());
                return;
            }
        } throw new Error("Item nao encontrado pelo Id " + Id);
    }

    public void listItens() {
        for (Product product : StockController.getStock()) {
            System.out.println("ID: " + product.getId() +
                    "\n \t Nome: " + product.getName() +
                    "\n \t Preço: " + product.getPrice() +
                    "\n \t Quantidade: " + product.getQuantity());
        }
    }
}
