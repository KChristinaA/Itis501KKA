public class User {
    String nickname;
    String lastSeen;
    String description;
    String registrationDate;
    String phoneNum;
    String birthday;

    public User(String nickname, String lastSeen, String description, String registrationDate, String phoneNum, String birthday) {
        this.nickname = nickname;
        this.lastSeen = lastSeen;
        this.description = description;
        this.registrationDate = registrationDate;
        this.phoneNum = phoneNum;
        this.birthday = birthday;
    }

    public void viewProfile() {
        System.out.println("Профиль пользователя " + nickname + ":\n");
        System.out.println("Описание: " + description + "\nДата регитсрации: " + registrationDate + "\nНомер телефона: " + phoneNum + "\nДата рождения: " + birthday);
    }
}
