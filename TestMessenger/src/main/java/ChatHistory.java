public class ChatHistory {
    public ChatHistory (String name) {
        for (int i = 0; i < Database.news.length; ++i) {
            if (Database.news[i].name.equals(name)) {
                ChannelMessages[] messages = ChannelMessages.getAllNews();
                System.out.println(name + "\n");
                for (int j = 0; j < messages.length; ++j) {
                    if (name.equals(messages[j].chatName)) {
                        System.out.println(messages[j].date + " " + messages[j].time + ": " + messages[j].text + "\n");
                    }
                }
                break;
            }
        }
        for (int i = 0; i < Database.groups.length + Database.chats.length; ++i) {
            if (Database.groups[i].name.equals(name) || Database.chats[i].name.equals(name)) {
                UserAndGroupMessage[] messages = UserAndGroupMessage.getAllMessages();
                System.out.println(name + "\n");
                for (int j = 0; j < messages.length; ++j) {
                    if (name.equals(messages[j].chatName)) {
                        System.out.println(messages[j].fromWhom + " " + messages[j].date + " " + messages[j].time + ": " + messages[j].text + "\n");
                    }
                }
                break;
            }
        }
    }
}
