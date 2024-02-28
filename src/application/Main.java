package application;

import model.services.UserInterfaceService;

public class Main {
    public static void main(String[] args) {
        UserInterfaceService userInterface = new UserInterfaceService();
        userInterface.displayMenu();
    }
}
