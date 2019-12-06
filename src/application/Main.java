package application;

import inputManager.InputManager;
import onlineShop.Storage;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        InputManager inputManager = new InputManager();
        storage.readUsersFile();
        storage.readItemsFile();
        try {
            inputManager.readUserId();
            inputManager.readItemId();
            inputManager.selectAction();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}


