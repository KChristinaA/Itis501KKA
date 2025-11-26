public class Main {
    public static void main(String[] args) {
        System.out.println("Список каналов:");
        for (ChannelChat x : Database.news) {
            System.out.println(x.name);
        }
        System.out.println("Список групп:");
        for (GroupChat x : Database.groups) {
            System.out.println(x.name);
        }
        System.out.println("Личных чатов:");
        for (UserChat x : Database.chats) {
            System.out.println(x.name);
        }
        System.out.println();
        new ChatHistory("Тимлид Анита");
        //красоту наводите сами
    }
}
