import model.User;
import service.InputUser;
import service.Program;

public class Main {
    public static void main(String[] args) {
        InputUser inputUser = new InputUser();
        User user = inputUser.checkUser();

        if (user == null) {
            System.out.println("Программа завершена! Доступ не разрешён");
        } else {
            Program program = new Program();
            program.doProgram(user);
        }
    }
}
