package loginController;

import onlineShop.Storage;

import java.io.FileNotFoundException;

public class LoginController {

    public boolean checkLogIn(int id) throws FileNotFoundException {
        if (Storage.getINSTANCE().readUsersFile().contains((id))) {
            return true;
        } else {
            return false;
        }
    }
}