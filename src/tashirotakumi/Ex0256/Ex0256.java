package tashirotakumi.Ex0256;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Ex0256 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input Date：");
		String inputStr = scan.nextLine();
		scan.close();
		try {
			LocalDate.parse(inputStr,
		    DateTimeFormatter.ofPattern("uuuu/MM/dd").withResolverStyle(ResolverStyle.STRICT));
		}catch (DateTimeParseException e) {
			System.out.println("指定した形式ではありません");
			return;
		}
		System.out.println("指定した形式です");
	}
}
