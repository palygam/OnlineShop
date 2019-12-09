package onlineShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private List<Integer> productsIds = new ArrayList<>();
    private Map<Integer, List> cart = new HashMap<>();

    public Map<Integer, List> getCart() {
        return cart;
    }

    public void setCart(Map<Integer, List> cart) {
        this.cart = cart;
    }

    public List<Integer> getProductsIds() {
        return productsIds;
    }

    public void setProductsIds(List<Integer> productsIds) {
        this.productsIds = productsIds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ShoppingCart{");
        sb.append("cart=").append(cart);
        sb.append('}');
        return sb.toString();
    }
}