package service;

import model.User;

public class Program {
    public void doProgram(User user) {
        if (user.userRole(user)) {
            System.out.println("Добро пожаловать, администратор!");
        } else {
            System.out.println("Добро пожаловать, пользователь!");
        }
    }
}
