import java.util.Scanner;
import java.util.regex.Pattern;

public class Regulars {
	public static void main(String[] args) {
		System.out.println("1. Введите пароль (только латинские символы, цифры и символы ^$%@#&!?):");

		Scanner scanner1 = new Scanner(System.in);
		String password1 = scanner1.nextLine();

		if (Pattern.matches("[a-zA-Z0-9\\^\\$%@#&!\\?]+", password1)) {
			System.out.println("Успешный ввод");
		} else {
			System.out.println("Пароль введён неверно");
		}

		System.out.println();


		System.out.println("2. Введите пароль (не менее 8 символов):");

		Scanner scanner2 = new Scanner(System.in);
		String password2 = scanner2.nextLine();

		if (Pattern.matches(".{8,}", password2)) {
			System.out.println("Успешный ввод");
		} else {
			System.out.println("Пароль введён неверно");
		}

		System.out.println();


		System.out.println("3. Введите пароль (как минимум один латинский символ в верхнем регистре):");

		Scanner scanner3 = new Scanner(System.in);
		String password3 = scanner3.nextLine();

		if (Pattern.matches(".*[A-Z]+.*", password3)) {
			System.out.println("Успешный ввод");
		} else {
			System.out.println("Пароль введён неверно");
		}

		System.out.println();


		System.out.println("4. Введите пароль (как минимум один латинский символ в нижнем регистре):");

		Scanner scanner4 = new Scanner(System.in);
		String password4 = scanner4.nextLine();

		if (Pattern.matches(".*[a-z]+.*", password4)) {
			System.out.println("Успешный ввод");
		} else {
			System.out.println("Пароль введён неверно");
		}

		System.out.println();


		System.out.println("5. Введите пароль (как минимум одна цифра):");

		Scanner scanner5 = new Scanner(System.in);
		String password5 = scanner5.nextLine();

		if (Pattern.matches(".*[0-9]+.*", password5)) {
			System.out.println("Успешный ввод");
		} else {
			System.out.println("Пароль введён неверно");
		}

		System.out.println();


		System.out.println("6. Задайте цвет (формат rgb(123, 233, 19) или #rrggbb):");

		Scanner scanner6 = new Scanner(System.in);
		String color = scanner6.nextLine();

		if (Pattern.matches("(rgb\\((([0-9]|[1-9][0-9]|[1][0-9]{2}|[2][0-4][0-9]|[2][5][0-5])\\,\s){2}([0-9]|[1-9][0-9]|[1][0-9]{2}|[2][0-4][0-9]|[2][5][0-5])\\))|#([0-9A-Fa-f]{2}){3}", color)) {
			System.out.println("Успешный ввод");
		} else {
			System.out.println("Пароль введён неверно");
		}

		System.out.println(); 


		System.out.println("7. Задайте дату (формат dd.MM.yyyy или dd.MM.yy или yyyy-MM-dd или dd/V/yyyy):");

		Scanner scanner7 = new Scanner(System.in);
		String date = scanner7.nextLine();
		/*
		String regDate1 = "((((0[1-9]|[12][0-9]|3[01])\\.(0[13578]|1[02]))|((0[1-9]|[12][0-9]|3[0])\\.(0[469]|11))|((0[1-9]|[12][0-9])\\.02))\\.[1-9][0-9]{0,3})";
		String regDate2 = "((((0[1-9]|[12][0-9]|3[01])\\.(0[13578]|1[02]))|((0[1-9]|[12][0-9]|3[0])\\.(0[469]|11))|((0[1-9]|[12][0-9])\\.02))\\.[0-9]{2})";
		String regDate3 = "([1-9][0-9]{0,3}\\-(((0[13578]|1[02])\\-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)\\-(0[1-9]|[12][0-9]|3[0]))|(02\\-(0[1-9]|[12][0-9]))))";
		String regDate4 = "((((0[1-9]|[12][0-9]|3[01])\\/(I|III|V|VII{2,3}|X|XII))|((0[1-9]|[12][0-9]|3[0])\\/(IV|VI|IX|XI))|((0[1-9]|[12][0-9])\\/II))\\/[1-9][0-9]{0,3})";

		String fullRegex = regDate1 + "|" + regDate2 + "|" + regDate3 + "|" + regDate4; */

		if (Pattern.matches("(((([1-9]|[12][0-9]|[3][01])\\.(0[13578]|[1][02]))|(([1-9]|[12][0-9]|[3][0])\\.([0][469]|[1]{2}))|(([1-9]|[12][0-9])\\.02))\\.[1-9][0-9]{0,3})|(((([1-9]|[1-2][0-9]|[3][0-1])\\.(0[13578]|[1][02]))|(([1-9]|[1-2][0-9]|[3][0])\\.([0][469]|[1]{2}))|(([1-9]|[1-2][0-9])\\.02))\\.[1-9][0-9]{0,1})|([1-9][0-9]{0,3}\\-(((0[13578]|[1][02])\\-([1-9]|[1-2][0-9]|[3][0-1]))|(([0][469]|[1]{2})\\-([1-9]|[1-2][0-9]|[3][0]))|(02\\-([1-9]|[1-2][0-9]))))|(((([1-9]|[12][0-9]|3[01])/(I|III|V|VII|VIII|X|XII))|(([1-9]|[12][0-9]|30)/(IV|VI|IX|XI))|(([1-9]|[12][0-9])/II))/[1-9][0-9]{0,3})", date)) {
		//if (Pattern.matches(fullRegex, date)) {

			System.out.println("Успешный ввод");
		} else {
			System.out.println("Пароль введён неверно");
		}

		scanner1.close();
		scanner2.close();
		scanner3.close();
		scanner4.close();
		scanner5.close();
		scanner6.close();
		scanner7.close();
		
	}
}