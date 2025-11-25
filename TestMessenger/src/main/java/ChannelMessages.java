public class ChannelMessages extends Message {
    public ChannelMessages(String chatName, String text, String date, String time) {
        super(chatName, text, date, time);
    }

    public static ChannelMessages[] getAllNews() {
        ChannelMessages[] news = {new ChannelMessages("Казань на Максималках", "в казани умерло 5 человек", "23 ноября", "14:12"), new ChannelMessages("Казань на Максималках", "депутаты из совфеда заставляют рожать сразу после 18", "25 ноября", "13:45"),
                new ChannelMessages("Новости ИТИС", "на допку по алгему попала половина студентов", "14 января", "09:27")};
        return news;
    }
}
