import java.util.Random;
public class RandomDirection { //реализация рандомайзера
    private Random random = new Random();
    int randomNum;

    public RandomDirection(int animal){
        if (animal < 3) {
            randomNum = random.nextInt(3);
        } else {
            randomNum = random.nextInt(4);
        }
    }

}
