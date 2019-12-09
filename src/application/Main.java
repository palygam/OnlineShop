package application;

import inputManager.InputManager;
import onlineShop.Storage;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        Storage.getINSTANCE();
        InputManager inputManager = new InputManager();
        try {
            inputManager.readFiles();
            inputManager.selectAction();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
