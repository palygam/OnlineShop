package OnlineShop;

import java.util.*;

public class User {
    private int id;
    private String FirstName;
    private String LastName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "OnlineShop.User{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                FirstName.equals(user.FirstName) &&
                LastName.equals(user.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, FirstName, LastName);
    }
}


