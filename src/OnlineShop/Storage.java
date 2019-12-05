package OnlineShop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Storage {
    private static Map<Integer, User> users = new HashMap<>();
    private static Map<Integer, Item> items = new HashMap<>();
    private static List<Item> cart = new ArrayList<>();
    private static Map<User, List> fullCart = new HashMap<>();

    public static Map<Integer, User> getUsers() {
        return users;
    }

    public static void setUsers(Map<Integer, User> users) {
        Storage.users = users;
    }

    public static Map<Integer, Item> getItems() {
        return items;
    }

    public static void setItems(Map<Integer, Item> items) {
        Storage.items = items;
    }

    public static List<Item> getCart() {
        return cart;
    }

    public static void setCart(List<Item> cart) {
        Storage.cart = cart;
    }

    public static Map<User, List> getFullCart() {
        return fullCart;
    }

    public static void setFullCart(Map<User, List> fullCart) {
        Storage.fullCart = fullCart;
    }

    public Map<Integer, User> readUsersFile() {
        try {
            Scanner scanner = new Scanner(new File("src/users.txt"));
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
                users.put(user.getId(), user);
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

    public Map<Integer, Item> readItemsFile() {
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Mariia_Palyga\\IdeaProjects\\OnlineShop\\src\\items.txt"));
            while (scanner.hasNextLine()) {
                Item item = new Item();
                String line = scanner.nextLine();
                String[] data = line.split(",");
                for (int i = 0; i < data.length; i++) {
                    if (!data[i].isEmpty()) {
                        item.setId(Integer.parseInt(data[0]));
                        item.setName(data[1]);
                        item.setPrice(Double.parseDouble(data[2]));
                    }
                }
                items.put(item.getId(), item);
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
