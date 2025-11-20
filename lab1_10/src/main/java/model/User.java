package model;

public class User {
    public String userName;
    public String password;

    //уточнить private и getUserName
    public User() {
        userName = "";
        password = "";
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static User[] getAll() {
        User[] users = {new User("Алёна", "замстаросты"), new User("Егор", "староста"), new User("Эльвина", "решала"), new User("Малика", "розоволосая")};
        return users;
    }
    public boolean userRole(User userInfo) {
        User[] users = userInfo.getAll();
        if (userInfo.userName.equals(users[0].userName) | userInfo.userName.equals(users[1].userName)) {
            return true;
        } else return false;
    }
}
