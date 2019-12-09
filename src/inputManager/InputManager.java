package inputManager;

import loginController.LoginController;
import onlineShop.*;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputManager {
    LoginController controller = new LoginController();
    ShoppingCartManager manager = new ShoppingCartManager();
    User user = new User();
    ShopItem item = new ShopItem();

    public void readFiles() throws FileNotFoundException {
        System.out.println("Please, enter your id");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            user.setId(scanner.nextInt());
            controller.checkLogIn(user.getId());
        }
        System.out.println("Please, enter the id of the item you want to purchase");
        Scanner scanner1 = new Scanner(System.in);
        if (scanner1.hasNext()) {
            item.setId(scanner1.nextInt());
            manager.addItem(user.getId(), item.getId());
            selectAction();
        }
    }

    public void selectAction() throws FileNotFoundException {
        System.out.println("Press 1 to continue, press 2 to proceed to checkout");
        Scanner scanner1 = new Scanner(System.in);
        if (scanner1.hasNext()) {
            String button = scanner1.nextLine();
            switch (button) {
                case "1":
                    readFiles();
                    break;
                case "2":
                    manager.printCart();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}