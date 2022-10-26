package MyClass;


import Entity.Buyer;
import Entity.Product;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;
import Manager.ManagerBuyer;
import Manager.ManagerProduct;


public class App {
    private Product[] products;
    private Buyer[] buyers;
    private final ManagerBuyer managerBuyer;
    private final ManagerProduct managerProduct;

    public App() {
        this.products = new Product[0];
        this.buyers = new Buyer[0];
        testAddPokupatel();
        managerBuyer = new ManagerBuyer();
        managerProduct = new ManagerProduct();

    }

    public void run() throws ParseException{
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Список задач: ");
            System.out.println("1. Võhod iz programmõ");
            System.out.println("2. Dobavit produkt");
            System.out.println("3. Spisok prodavaemõh produkt");
            System.out.println("4. dobavit pokupatela");
            System.out.println("5. Spisok zaregistrirovannõh pokupatelei");
            System.out.println("6. Pokupka pokupatelem produkta");
            System.out.println("7. Dohod magazina za vse vrema rabotõ");
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println("=====================================");
            switch (task) {
                case 1:
                    repeat = false;
                    System.out.println("1. Võhod iz programmõ");
                    break;
                case 2:
                    System.out.println("2. Dobavit produkt");
                    this.products = Arrays.copyOf(this.products, this.products.length+1);
                    this.products[this.products.length-1] = managerProduct.createProduct();
                    break;
                case 3:
                    System.out.println("3. Spisok prodavaemõh produktov");
                    managerProduct.printListProducts(products);
                    break;
                case 4:
                    System.out.println("4. dobavit pokupatela");
                    this.buyers = Arrays.copyOf(this.buyers, this.buyers.length+1);
                    this.buyers[this.buyers.length-1] = managerBuyer.createPokupatel();
                    break;
                case 5:
                    System.out.println("5. Spisok zaregistrirovannõh pokupatelei");

                    break;
                case 6:
                    System.out.println("6. Pokupka pokupatelem produkta");

                    break;
                case 7:
                    System.out.println("7. Dohod magazina za vse vrema rabotõ");

                    break;
            }
            System.out.println("=======================================");
        }while(repeat);
        System.out.println("Пока, ребята!");
    }

    private void testAddPokupatel(){

        Buyer buyer = new Buyer("Vlad","Kuznetsov");
        this.buyers = Arrays.copyOf(this.buyers, this.buyers.length+1);
        this.buyers[this.buyers.length-1] = buyer;
    }

    private void testAddProduct() {

        Product product = new Product();
        product.setTitle("Product for editing");
        Buyer buyer = new Buyer();
        buyer.setFirstname("Firstname");
        buyer.setLastname("Lastname");
        Buyer[] productBuyers = new Buyer[1];
        productBuyers[0] = buyer;
        product.setBuyers(productBuyers);
        this.products = Arrays.copyOf(this.products, this.products.length+1);
        this.products[this.products.length-1] = product;
    }

}

