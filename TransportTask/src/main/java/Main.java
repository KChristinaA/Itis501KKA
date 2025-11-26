import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите пункт отправления: ");
        Scanner scanner1 = new Scanner(System.in);
        String outCity = scanner1.nextLine();
        System.out.print("Введите пункт назначения: ");
        Scanner scanner2 = new Scanner(System.in);
        String toCity = scanner2.nextLine();
        System.out.println();
        Route.Marshroute(outCity, toCity);

        scanner1.close();;
        scanner2.close();
    }
}
