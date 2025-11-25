public class UserAndGroupMessage extends Message {

    String fromWhom;
    public UserAndGroupMessage(String chatName, String text, String date, String time, String fromWhom) {
        super(chatName, text, date, time);
        this.fromWhom = fromWhom;
    }

    public static UserAndGroupMessage[] getAllMessages() {
        UserAndGroupMessage[] messages = {new UserAndGroupMessage("Тимлид Анита", "анита, когда зарплата", "25 ноября", "18:01", "Вы"), new UserAndGroupMessage("Тимлид Анита", "не заслужила", "25 ноября", "18:03", "Анита"),
                new UserAndGroupMessage("Тимлид Анита", "да я в полицию пойду", "25 ноября", "18:04", "Вы"), new UserAndGroupMessage("Тимлид Анита", "Да дааа", "25 ноября", "18:06", "Анита"),
                new UserAndGroupMessage("Инфа проект", "Ну что, как делить будем?", "25 ноября", "18:14", "Алёна"), new UserAndGroupMessage("Инфа проект", "Давайте в среду начнём", "25 ноября", "18:15", "Диана"),
                new UserAndGroupMessage("Инфа проект", "Да вы че", "25 ноября", "18:15", "Кристина"), new UserAndGroupMessage("Инфа проект", "Работайте работайте", "25 ноября", "18:16", "Анита")};
        return messages;
    }
}
