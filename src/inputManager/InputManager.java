package inputManager;

import loginController.LoginController;
import onlineShop.ShoppingCart;

import java.util.Scanner;

public class InputManager {
    LoginController controller = new LoginController();
    ShoppingCart cart = new ShoppingCart();

    public void readUserId() {
        System.out.println("Please, enter your id");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int id = scanner.nextInt();
            controller.checkLogIn(id);
        }
    }

    public void readItemId() {
        System.out.println("Please, enter the id of the item you want to purchase");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int itemChoice = scanner.nextInt();
            cart.addItem(itemChoice);
            selectAction();
        }
    }

    public void readItemIdAndRemove() {
        System.out.println("Please, enter the id of the item you want to remove");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int itemChoice = scanner.nextInt();
            cart.removeItem(itemChoice);
            System.out.println();
            selectAction();
        }
    }

    public void selectAction() {
        System.out.println("Press 1 to continue, press 2 to remove an item from your shopping cart, press 3 to proceed to checkout");
        Scanner scanner1 = new Scanner(System.in);
        if (scanner1.hasNext()) {
            String button = scanner1.nextLine();
            switch (button) {
                case "1":
                    readItemId();
                    break;
                case "2":
                    readItemIdAndRemove();
                    break;
                case "3":
                    cart.printCart();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}