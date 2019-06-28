package tashirotakumi.Ex0370;

import java.util.Scanner;

public class Ex0370 {
	public static int count = 1;

	public static void main(String[] args) {

		clipNumberStoring(args, clipNumberComparison());
	}

	public static String clipNumberComparison() {

		System.out.print("(" + count + ")回目予測数字を入力してください：");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String input = scan.nextLine();
		count++;

		return input;
	}

	public static void clipNumberStoring(String[] args, String input) {

		int hitCount = 0;
		int blowCount = 0;
		char[] clipNumber = input.toCharArray();
		char[] answer = args[0].toCharArray();
		int inputNum = 0;
		try {
			inputNum = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			clipNumberStoring(args, clipNumberComparison());
		}
		if (inputNum < 999 || inputNum >= 10000) {
			System.err.println("4桁の数字を入力してください");
			clipNumberStoring(args, clipNumberComparison());
		}
		if (input.equals("999")) {
			System.out.println("正解は" + args[0] + "でした。");
			System.exit(0);
		}
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < args[0].length(); j++) {
				if (clipNumber[i] == answer[j] && i == j) {
					hitCount++;
				} else if (clipNumber[i] == answer[j]) {
					blowCount++;
				}
			}
		}
		if (hitCount == args[0].length()) {
			System.out.println("正解です");
			System.exit(0);
		}
		System.out.println("ヒット：" + hitCount + "ブロー：" + blowCount);
		if (hitCount != args[0].length()) {
			clipNumberStoring(args, clipNumberComparison());
		}
	}
}
