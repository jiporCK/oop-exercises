package collectionframeworks.exercise.pms;

import java.util.List;
import java.util.Scanner;

public class Demo {

    static void menu() {
        System.out.println("=========| PMS |=========");
        System.out.println("1. Create new product");
        System.out.println("2. Update by id");
        System.out.println("3. Delete by id");
        System.out.println("4. Get all products");
        System.out.println("5. Get by id");
        System.out.println("0. Exit");
        System.out.println("++++++++++++++++++++++++");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductService service = new ProductServiceImpl();

        int option;
        do {
            menu();
            System.out.print("Enter an option -> ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1: {
                    Product product = new Product();

                    System.out.print("Enter product name: ");
                    product.setName(scanner.nextLine());

                    System.out.print("Enter product price: ");
                    product.setPrice(Double.parseDouble(scanner.nextLine()));

                    System.out.print("Enter product qty: ");
                    product.setQty(Integer.parseInt(scanner.nextLine()));

                    if (service.create(product)) {
                        System.out.println("Product created successfully");
                    } else {
                        System.out.println("Failed to create product");
                    }

                    break;
                }
                case 2: {
                    System.out.print("Enter a product id: ");
                    Long id = Long.parseLong(scanner.nextLine());

                    Product foundProduct = service.getById(id);

                    System.out.print("Enter new name: ");
                    foundProduct.setName(scanner.nextLine());

                    System.out.print("Enter new price: ");
                    foundProduct.setPrice(Double.parseDouble(scanner.nextLine()));

                    System.out.print("Enter new qty: ");
                    foundProduct.setQty(Integer.parseInt(scanner.nextLine()));

                    service.updateById(id,  foundProduct);

                    break;
                }
                case 3: {
                    System.out.print("Enter id to delete: ");
                    boolean isDeleted = service.deleteById(Long.parseLong(scanner.nextLine()));
                    if (isDeleted) {
                        System.out.println("Product deleted successfully");
                    } else {
                        System.out.println("Failed to create product");
                    }
                    break;
                }
                case 4: {
                    List<Product> existsProducts = service.getAll();
                    System.out.println("========| Product List |========");
                    System.out.println("ID\tName\t\tPrice\tQty");
                    for (Product p : existsProducts) {
                        System.out.printf("%d\t%s\t\t%.2f\t%d\n",
                                p.getId(),
                                p.getName(),
                                p.getPrice(),
                                p.getQty());
                    }
                    break;
                }
                case 5: {
                    System.out.print("Enter a product id: ");
                    Long id = Long.parseLong(scanner.nextLine());

                    Product foundProduct = service.getById(id);

                    System.out.println(foundProduct);

                    break;
                }
                case 0: {
                    System.out.println("Exiting...");
                    break;
                }
                default:
                    System.out.println("Invalid option!");
                    break;
            }

        } while (option != 0);
    }

}
