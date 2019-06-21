package tashirotakumi.Ex0114;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex0114 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		System.out.println("文字列：");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String input = scan.nextLine();
		scan.close();
		list = Comparison(input);

		for (int i = list.size(); i > 0; i--) {
			System.out.print(list.get(i - 1) + "	");
		}
	}

	public static List<String> Comparison(String input) {
		String chipped;
		List<String> list = new ArrayList<>();
		while (0 != input.length()) {
			if (0 != input.indexOf(" ")) {
				if (-1 == input.indexOf(" ")) {
					chipped = input;
					list.add(chipped);
					return list;
				}
				chipped = input.substring(0, input.indexOf(" "));
				input = input.substring(input.indexOf(" "), input.length());
				list.add(chipped);

			} else {
				input = input.substring(1, input.length());
			}
		}
		return list;
	}
}
