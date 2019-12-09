package onlineShop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public final class Storage {
    private static final String usersFilePath = "resources/users.txt";
    private static final String itemsFilePath = "resources/items.txt";

    private Storage() throws FileNotFoundException {
        readUsersFile();
        readItemsFile();
    }

    public static Storage INSTANCE;

    public static Storage getINSTANCE() {
        try {
            if (INSTANCE == null) {
                INSTANCE = new Storage();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return INSTANCE;
    }

    private List<Integer> users = new ArrayList<>();
    private List<Integer> items = new ArrayList<>();

    public static String getUsersFilePath() {
        return usersFilePath;
    }

    public static String getItemsFilePath() {
        return itemsFilePath;
    }

    public List<Integer> readUsersFile() throws FileNotFoundException {
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
            users.add(user.getId());
        }
        return users;
    }

    public List<Integer> readItemsFile() throws FileNotFoundException {
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
            items.add(shopItem.getId());
        }
        return items;
    }
}