import controller.StockController;
import entity.Product;
import services.AddService;
import services.RemoveService;
import services.ViewItensService;

public class Main {
    public static void main(String[] args) {
        AddService addService = new AddService();
        RemoveService removeService = new RemoveService();
        ViewItensService viewItensService = new ViewItensService();
        StockController stockController = new StockController();

        addService.addProduct(1, "Iphone", 150, 6500);
        addService.addProduct(2, "Macbook", 100, 7000);
        addService.addProduct(3, "Ipad", 125, 5500);

        System.out.println("");

        removeService.removeProduct("Iphone", stockController.findById(1));

        System.out.println("");

        viewItensService.viewQuantity(2);

        System.out.println("");

        viewItensService.listItens();
    }
}