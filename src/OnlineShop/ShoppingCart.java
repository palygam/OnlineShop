package OnlineShop;

import java.util.*;

public class ShoppingCart implements Removable {

    @Override
    public void addItem(int id) {
        int itemChoice;
        System.out.println("Enter the id of the item you want to purchase");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            itemChoice = scanner.nextInt();
            if (Storage.getItems().containsKey(itemChoice)) {
                Storage.getCart().add(Storage.getItems().get(itemChoice));
                System.out.println("You have " + Storage.getCart() + "in your shopping cart");
            } else {
                System.out.println("There is no such item in our shop.");
                addItem(id);
            }
        }
        System.out.println("Press 1 to continue, press 2 to remove an item from your shopping cart, press 3 to proceed to checkout");
        Scanner scanner1 = new Scanner(System.in);
        if (scanner1.hasNext()) {
            String button = scanner1.nextLine();
            if (button.equals("1")) {
                addItem(id);
            } else if (button.equals("2")) {
                removeItem(id);
            } else if (button.equals("3")) {
                // printCart();
                displayFullCart(id);

            } else {
                System.exit(0);
            }
        }
    }

    @Override
    public void removeItem(int id) {
        int itemChoice;
        System.out.println("Enter the id of the item you want to remove");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            itemChoice = scanner.nextInt();
            if (Storage.getItems().containsKey(itemChoice)) {
                Storage.getCart().remove(Storage.getItems().get(itemChoice));
                System.out.println("You have " + Storage.getCart() + " in your shopping cart");
            } else {
                System.out.println("There is no such item in your cart");
                removeItem(id);
            }
        }
        System.out.println("Press 1 to continue, press 2 to remove an item from your shopping cart, press 3 to exit");
        Scanner scanner1 = new Scanner(System.in);
        if (scanner1.hasNext()) {
            String button = scanner1.nextLine();
            if (button.equals("1")) {
                addItem(id);
            } else if (button.equals("2")) {
                removeItem(id);
            } else if (button.equals("3")) {
                //printCart();
                displayFullCart(id);
                System.out.println("The full cost of your purchase is: ");
            } else {
                System.exit(0);
            }
        }
    }

    public void printCart() {
        System.out.println("There are following items in your cart: " + Storage.getCart());
    }

    public void displayFullCart(int id) {
        Storage.getFullCart().put(Storage.getUsers().get(id), Storage.getCart());
        System.out.println(Storage.getFullCart());
    }

}
