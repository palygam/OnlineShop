package onlineShop;

import java.io.FileNotFoundException;

public class ShoppingCartManager implements CartModifiable {
    ShoppingCart cart = new ShoppingCart();
    User user = new User();
    ShopItem item = new ShopItem();

    @Override
    public void addItem(int id, int itemChoice) throws FileNotFoundException {
        if (Storage.getINSTANCE().readItemsFile().contains(itemChoice)) {
            cart.getProductsIds().add(itemChoice);
            cart.getCart().put(id, cart.getProductsIds());
        }
    }

    public void printCart() {
        System.out.println("There are following items in your cart: " + cart);
    }

}