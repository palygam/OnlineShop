package loginController;

import onlineShop.Storage;

public class LoginController {

    public boolean checkLogIn(int id) {
        if (Storage.getUsers().containsKey(id)) {
            return true;
        } else {
            throw new IllegalArgumentException("Invalid id");
        }
    }
}

