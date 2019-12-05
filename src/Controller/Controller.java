package Controller;

import OnlineShop.ShoppingCart;
import OnlineShop.Storage;

import java.util.Scanner;

public class Controller {

    public void checkLogIn() {
        System.out.println("Please, enter your id");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int id = scanner.nextInt();
            if (Storage.getUsers().containsKey(id)) {
                System.out.println("Login successful");
                System.out.println(Storage.getUsers().get(id));
                ShoppingCart newCart = new ShoppingCart();
                newCart.addItem(id);
            } else {
                System.out.println("Invalid id");
                checkLogIn();;
            }
        }
    }
}
