import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;

public class FindStringInPushkin {
    public static void main(String args[]) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("C:\\JavaItisProjects\\IDEAitis\\HomeworkPushkin\\src\\main\\java\\pushkin.txt"));

        FindInText search = new FindInText();
        search.run(scanner);

        Scanner scanner1 = new Scanner(new File("C:\\JavaItisProjects\\IDEAitis\\HomeworkPushkin\\src\\main\\java\\pushkin.txt"));

        FindInText search1 = new FindInText(new Pattern[] {Pattern.compile(".*\s[Мм]ил.*")}); //произвольная регулярка
        search1.run(scanner1);

        scanner.close();
        scanner1.close();
    }
}