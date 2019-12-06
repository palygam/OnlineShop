package onlineShop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Storage {
    private static final String usersFilePath = "C:\\Users\\Mariia_Palyga\\IdeaProjects\\OnlineShop\\resources\\users.txt";
    private static final String itemsFilePath = "C:\\Users\\Mariia_Palyga\\IdeaProjects\\OnlineShop\\resources\\items.txt";


    private static Map<Integer, String> users = new HashMap<>();
    private static Map<Integer, ShopItem> items = new HashMap<>();
    private static List<ShopItem> cart = new ArrayList<>();


    public static Map<Integer, String> getUsers() {
        return users;
    }

    public static void setUsers(Map<Integer, String> users) {
        Storage.users = users;
    }

    public static Map<Integer, ShopItem> getItems() {
        return items;
    }

    public static void setItems(Map<Integer, ShopItem> items) {
        Storage.items = items;
    }

    public static List<ShopItem> getCart() {
        return cart;
    }

    public static void setCart(List<ShopItem> cart) {
        Storage.cart = cart;
    }

    public Map<Integer, String> readUsersFile() {
        try {
            Scanner scanner = new Scanner(new File(usersFilePath));
            while (scanner.hasNext()) {
                User user = new User();
                String nextLine = scanner.nextLine();
                String[] userData = nextLine.split(",");

                for (int i = 0; i < userData.length; i++) {
                    if (!userData[i].isEmpty()) {
                        user.setId(Integer.parseInt(userData[0]));
                        user.setFirstName(userData[1]);
                        user.setLastName(userData[2]);
                    }
                }
                users.put(user.getId(), user.getLastName());
            }
            return users;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Check whether the file exists");
        }
        return users;
    }

    public void printUsers() {
        System.out.println(users);
    }

    public Map<Integer, ShopItem> readItemsFile() {
        try {
            Scanner scanner = new Scanner(new File(itemsFilePath));
            while (scanner.hasNextLine()) {
                ShopItem shopItem = new ShopItem();
                String line = scanner.nextLine();
                String[] data = line.split(",");
                for (int i = 0; i < data.length; i++) {
                    if (!data[i].isEmpty()) {
                        shopItem.setId(Integer.parseInt(data[0]));
                        shopItem.setName(data[1]);
                        shopItem.setPrice(Double.parseDouble(data[2]));
                    }
                }
                items.put(shopItem.getId(), shopItem);
            }
            return items;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Check whether the file exists");
        }
        return items;
    }

    public void printItems() {
        System.out.println(items);
    }
}
