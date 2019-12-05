package Application;

import Controller.Controller;
import OnlineShop.Storage;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        Controller controller = new Controller();
        storage.readUsersFile();
        storage.readItemsFile();
        // storage.printUsers();
        storage.printItems();
        controller.checkLogIn();
    }
}
