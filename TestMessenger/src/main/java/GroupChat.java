public class GroupChat {
    String name;
    int count;
    String[] members;
    public GroupChat(String name, String[] members) {
        this.name = name;
        count = members.length;
        this.members = members;
    }
}
