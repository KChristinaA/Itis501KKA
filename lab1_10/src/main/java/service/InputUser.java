package service;

import model.User;
import java.util.Scanner;

public class InputUser {

    User userInfo = new User();

    public User checkUser() {
        System.out.println("Введите логин:");
        Scanner scanner1 = new Scanner(System.in);
        userInfo.userName = scanner1.nextLine();
        if (userInfo.userName.equals("exit")) {
            System.out.println("Попробуйте ещё раз");
            return null;
        };
        System.out.println("Введите пароль:");
        Scanner scanner2 = new Scanner(System.in);
        userInfo.password = scanner2.nextLine();

        User[] users = User.getAll();

        boolean find = false;
        for (User x : users) {
            if (x.userName.equals(userInfo.userName) & x.password.equals(userInfo.password)) find = true;
        }

        return find ? userInfo : null;
    }
}
