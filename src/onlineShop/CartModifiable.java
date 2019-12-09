package onlineShop;

import java.io.FileNotFoundException;

public interface CartModifiable {
    void addItem(int id, int itemChoice) throws FileNotFoundException;
}