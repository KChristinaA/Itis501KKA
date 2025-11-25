public class UserChat {
    String name;
    String info;
    public UserChat(User person) {
        name = person.nickname;
        info = person.lastSeen;
    }
}
