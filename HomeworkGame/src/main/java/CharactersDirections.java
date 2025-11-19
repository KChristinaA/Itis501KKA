public class CharactersDirections {
    public RandomDirection animal;
    public CharactersDirections(String creature) { //присваиваем каждому зверю заодно номер, чтобы быстрее обращаться к рандомайзеру
        switch (creature) {
            case("turtle"): animal = new RandomDirection(1); break; //получаем рандомное число от 0 до 2
            case("kuznechik"): animal = new RandomDirection(2); break;
            case("ant"): animal = new RandomDirection(3); break; //рандомное число от 0 до 3
            case("bee"): animal = new RandomDirection(4); break;
            default: break;
        }
    }
}
