public class Message {
    String chatName;
    String text;
    String date;
    String time;

    protected Message(String chatName, String text, String date, String time) {
        this.chatName = chatName;
        this.text = text;
        this.date = date;
        this.time = time;
    }
}
