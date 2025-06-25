package collectionframeworks.exercise.taskmanager;

import java.util.Scanner;

public class Demo {

    static void menu() {
        System.out.println("=========| Todo |=========");
        System.out.println("1. Add task");
        System.out.println("2. Mark as complete");
        System.out.println("3. Delete task by id");
        System.out.println("0. Exit");
        System.out.println("++++++++++++++++++++++++");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TodoManager manager = new TodoManagerImpl();

        int op;
        do {

            menu();
            System.out.print("Enter an option: ");
            op = Integer.parseInt(scanner.nextLine());

            switch (op) {
                case 1: {
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter description: ");
                    String desc = scanner.nextLine();

                    if (manager.addTask(title, desc)) {
                        System.out.println("Added successfully");
                    } else {
                        System.out.println("Failed to create");
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter an id: ");
                    Long id = Long.parseLong(scanner.nextLine());

                    if (manager.markTaskAsCompleted(id)) {
                        System.out.println("Successfully");
                    } else {
                        System.out.println("Failed");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Enter an id: ");
                    Long id = Long.parseLong(scanner.nextLine());

                    if (manager.deleteTask(id)) {
                        System.out.println("Successfully");
                    } else {
                        System.out.println("Failed");
                    }
                    break;
                }
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }

        } while (op != 0);

    }

}
