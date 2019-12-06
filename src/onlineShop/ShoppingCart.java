package onlineShop;

public class ShoppingCart implements CartModifiable {


    @Override
    public void addItem(int itemChoice) {
        ShopItem productChoice = Storage.getItems().get(itemChoice);
        if (Storage.getItems().containsKey(itemChoice)) {
            Storage.getCart().add(productChoice);
            System.out.println("You have " + Storage.getCart() + "in your shopping cart");
        }
    }

    @Override
    public void removeItem(int itemChoice) {
        ShopItem productChoice = Storage.getItems().get(itemChoice);
        if (Storage.getItems().containsKey(itemChoice)) {
            Storage.getCart().remove(productChoice);
            System.out.println("You have " + Storage.getCart() + " in your shopping cart");
        }
    }

    public void printCart() {
        System.out.println("There are following items in your cart: " + Storage.getCart());
    }

}

