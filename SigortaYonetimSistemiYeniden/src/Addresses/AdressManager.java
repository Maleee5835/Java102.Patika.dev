package Addresses;

import User.User;

public class AdressManager {

    public static void addAddress(User user, Adress address) {
        user.getAddressArrayList().add((AdressManager) address);
    }

    public static void removeAddress(User user, Adress address) {
        user.getAddressArrayList().remove(address);
    }
}
