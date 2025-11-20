import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindInText {
    Pattern[] tasks; //создаём массив с будущими регулярными выражениями

    public FindInText() { //заданные изначально регулярные выражения
        tasks = new Pattern[] {
                Pattern.compile("(.*(\sя|Я)[\s\\,\\.\\?\\;\\!].*?)|(.*(\sм|М)не[\s\\,\\.\\?\\;\\!].*?)|(.*(\sм|М)оё[\s\\,\\.\\?\\;\\!].*?)"),
                Pattern.compile(".*((\sм|М)ор([еяю]|ем))[\s\\,\\.\\?\\;\\!].*?"),
                Pattern.compile(".*(\sм|М)уза[\s\\,\\.\\?\\;\\!].*?"),
                Pattern.compile(".*(\sл|Л)юбовь[\s\\,\\.\\?\\;\\!].*?"),
                Pattern.compile(".*(\sв|В)етры[\s\\,\\.\\?\\;\\!].*\sвеют[\s\\,\\.\\?\\;\\!].*?"),
                Pattern.compile(".*(\sд|Д)рузья[\s\\,\\.\\?\\;\\!].*?"),
                Pattern.compile(".*(\sп|П)оэт[\s\\,\\.\\?\\;\\!].*?"),
                Pattern.compile(".*(\sв|В)зор[\s\\,\\.\\?\\;\\!].*\s(вс)*тревожит[\s\\,\\.\\?\\;\\!].*?")
        };
        System.out.println("Список искомых строк: \n 1. Я, мне, моё \n 2. море (моря, морем, морю, ...) \n 3. муза \n 4. любовь \n 5. ветры ... веют \n 6. друзья \n 7. поэт \n 8. взор ... (вс)тревожит");
    }

    public FindInText(Pattern[] newReg) { //конструктор без аргументов
        tasks = newReg;
    }

    public void run(Scanner scanner) { //поиск в самом файле
        String[][][] list = new String[tasks.length][5][2]; //итоговый список, сначала кол-во заданных регулярок, потом максимум предложений, а затем одно место под нумерацию, второе под само предложение

        int lineNumber = 0; //номер строки
        int[] counter = new int[tasks.length]; //отдельные счётчики под каждую регулярку
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine() + " ";
            ++lineNumber;
            for (int i = 0; i < tasks.length; ++i) {
                if (counter[i] < 5) { //если не превысило максимальное количество найденных искомых предложений
                    Matcher matcher = tasks[i].matcher(line);
                    if (matcher.find()) { //если строка подошла, добавляем ее номер и ее саму в массив
                        list[i][counter[i]][0] = lineNumber + "";
                        list[i][counter[i]][1] = line;
                        ++counter[i];
                    }
                }
            }
        }
        for (int i = 0; i < list.length; ++i) {
            System.out.println("Регулярному выражению " + (i + 1) + " удовлетворяют строки: "); //вывод строк
            for (int j = 0; j < list[i].length; ++j) {
                if (list[i][j][0] == null) break;
                System.out.println(list[i][j][0] + ": " + list[i][j][1]);
            }
        }
    }

}