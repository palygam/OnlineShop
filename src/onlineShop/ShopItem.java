package onlineShop;

public class ShopItem {
    private int id;
    private String name;
    private double price;

    public ShopItem() {
    }

    public ShopItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ShopItem{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}