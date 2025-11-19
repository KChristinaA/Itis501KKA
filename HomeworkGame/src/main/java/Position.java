public class Position {
    public int column; //координаты
    public int row;
    public int boardLimit = 1000; //границы целого поля
    //String numbersdir = ""; //всё еще проверка на работоспособность


    public Position(int column, int row) { //координаты вручную
        this.column = column;
        this.row = row;
    }

    public Position() { //автоматические координаты
        column = 1;
        row = 1;
    }

    public void moving(String animal) {
        CharactersDirections direct = new CharactersDirections(animal); //определяем, кто ходит и какие у него ходы
        int num = direct.animal.randomNum; //получаем направление
        //numbersdir += num; //проверка
        switch (animal) { //само перемещение
            case("turtle"):
                if (num == 0 & column >= 1) --column;
                if (num == 1 & row <= boardLimit - 1) ++row;
                if (num == 2 & column <= boardLimit - 1) ++column;
                break;
            case("kuznechik"):
                if (num == 0 & column >= 1) --column;
                if (num == 1 & row <= boardLimit - 2) row += 2;
                if (num == 2 & column <= boardLimit - 1) ++column;
                break;
            case("ant"):
                if (num == 0 & column >= 1) --column;
                if (num == 1 & row <= boardLimit - 1) ++row;
                if (num == 2 & column <= boardLimit - 1) ++column;
                if (num == 3 & row >= 1) --row;
                break;
            case("bee"):
                if (num == 0 & column >= 2) column -= 2;
                if (num == 1 & row <= boardLimit - 3) row += 3;
                if (num == 2 & column <= boardLimit -2) column += 2;
                if (num == 3 & row >= 1) --row;
                break;
            default: break;
        }
    }
}
