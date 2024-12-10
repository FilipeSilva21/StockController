import controller.StockController;
import entity.Product;
import services.AddService;
import services.RemoveService;
import services.ViewItensService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddService addService = new AddService();
        RemoveService removeService = new RemoveService();
        ViewItensService viewItensService = new ViewItensService();
        StockController stockController = new StockController();
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma opcao: ");
        System.out.println("1. Adicionar um produto");
        System.out.println("2. Remover um produto");
        System.out.println("3. Ver a quantidade de um produto");
        System.out.println("4. Ver todos os itens em estoque");
        System.out.println("5. Sair");
        int choice = scan.nextInt();

        switch (choice){
            case (1):
                System.out.println("Informe o Id do produto");
                int Id = scan.nextInt();
                scan.nextLine();
                System.out.println("Informe o nome do produto");
                String name = scan.nextLine();
                System.out.println("Informe a quantidade do produto");
                int quant = scan.nextInt();
                System.out.println("Informe o preco do produto");
                int price = scan.nextInt();
                addService.addProduct(Id, name, quant ,price);
            break;

            case (2):
                System.out.println("Informe o nome do produto");
                String name1 = scan.nextLine();
                System.out.println("Informe o Id do produto");
                int Id1 = scan.nextInt();
                removeService.removeProduct(name1, Id1);
            break;

            case (3):
                System.out.println("Informe o Id do produto");
                int Id2 = scan.nextInt();
                viewItensService.viewQuantity(Id2);
            break;

            case (4):
                viewItensService.listItens();
            break;

            case (5):
                System.out.println("Saindo...");
                return;

            default:
                System.out.println("Opcao invalida. Tente novamente.");
        }

    }
}
