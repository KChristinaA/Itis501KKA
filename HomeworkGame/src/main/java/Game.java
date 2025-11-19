public class Game {
    public static void main(String[] args) {
        int[] borders = {400, 600, 400, 600}; //границы лево, парво, верх, низ
        boolean win = false; //выполнено ли условие для победы
        Position turtle = new Position(); //создаём классы с координатами участников
        Position kuznechik = new Position();
        Position ant = new Position();
        Position bee = new Position();
        while (win == false) { //пока нет победителей - работаем
            turtle.moving("turtle"); //перемещаем их в случайное направление
            kuznechik.moving("kuznechik");
            ant.moving("ant");
            bee.moving("bee");
            win = winCheck(turtle, kuznechik, ant, bee, borders); //проверка на победу
        }
        System.out.println("Позиции всех участников на конец игры:");
        System.out.println("Черепаха: [" + turtle.column + "; " + turtle.row + "]");
        System.out.println("Кузнечик: [" + kuznechik.column + "; " + kuznechik.row + "]");
        System.out.println("Муравей: [" + ant.column + "; " + ant.row + "]");
        System.out.println("Пчела: [" + bee.column + "; " + bee.row + "]");
        System.out.println("Победители: " + animalWinner(turtle, kuznechik, ant, bee, borders));
/*        System.out.println(bee.numbersdir); //проверка, не сломанный ли код
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;
        for (int i = 0; i < bee.numbersdir.length(); ++i) {
            if (bee.numbersdir.charAt(i) == '0') ++zeros;
            if (bee.numbersdir.charAt(i) == '1') ++ones;
            if (bee.numbersdir.charAt(i) == '2') ++twos;
            if (bee.numbersdir.charAt(i) == '3') ++threes;
        }
        System.out.println(zeros + " " + ones + " " + twos + " " + threes); */
    }

    public static boolean winCheck(Position first, Position second, Position third, Position fourth, int[] borders) { //проверяем, попал ли кто-нибудь в нужный квадрат
        Position[] animals = {first, second, third, fourth};
        for (Position x : animals) {
            if (x.column >= borders[0] & x.column <= borders[1] & x.row >= borders[2] & x.row <= borders[3]) return true;
        }
        return false;
    }

    public static String animalWinner(Position first, Position second, Position third, Position fourth, int[] borders) { //если попал в квадрат, то кто
        String winner = "";
        if (first.column >= borders[0] & first.column <= borders[1] & first.row >= borders[2] & first.row <= borders[3]) winner += "черепаха "; //складываем, потмоу что может быть несколько победителей
        if (second.column >= borders[0] & second.column <= borders[1] & second.row >= borders[2] & second.row <= borders[3]) winner += "кузнечик ";
        if (third.column >= borders[0] & third.column <= borders[1] & third.row >= borders[2] & third.row <= borders[3]) winner += "муравей ";
        if (fourth.column >= borders[0] & fourth.column <= borders[1] & fourth.row >= borders[2] & fourth.row <= borders[3]) winner += "пчела ";
        return winner;
    }
}
