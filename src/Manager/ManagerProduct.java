package Manager;

import Entity.Buyer;
import Entity.Product;
import java.util.Scanner;


public class ManagerProduct {
    private Scanner scanner;

    public ManagerProduct() {
        this.scanner = new Scanner(System.in);
    }

    public Product createProduct(){
        Product product = new Product();
        System.out.print("Введите название продукта: ");
        product.setTitle(scanner.nextLine());
        System.out.print("Введите число покупателей: ");
        int countPokupateliInProduct = scanner.nextInt();
        scanner.nextLine();
        product.setBuyers(createPokupateli(countPokupateliInProduct));
        return product;
    }

    private Buyer[] createPokupateli(int countPokupateliInProduct) {
        Buyer[] pokupateli = new Buyer[countPokupateliInProduct];
        for (int i = 0; i < countPokupateliInProduct; i++) {
            Buyer pokupatel = new Buyer();
            System.out.print("Имя покупателя "+(i+1)+": ");
            pokupatel.setFirstname(scanner.nextLine());
            System.out.print("Фамилия покупателя "+(i+1)+": ");
            pokupatel.setLastname(scanner.nextLine());
            pokupateli[i] = pokupatel;
        }
        return pokupateli;
    }

    public void printListProducts(Product[] products){
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.printf(i+1+". Product{title = %s%n",product.getTitle());
            System.out.print("\tPokupateli = [\n");
            for (int j = 0; j < product.getBuyers().length; j++) {
                Buyer pokupatel = product.getBuyers()[j];
                System.out.printf("\t\t%s %s%n"
                        ,pokupatel.getFirstname(),pokupatel.getLastname());
            }
            System.out.println("\t]");
        }
        System.out.println("   }");
    }

}