package tashirotakumi.Ex0371;

import java.util.Scanner;

public class Ex0371 {
	public static int INPUT_COUNT = 1;
	public static final int DIGITNUMBERCHECK = 4;
	public static final String  GIVE_UP_NUMBER ="999";

	public static void main(String[] args) {
		clipNumberStoring(args, checkNumberHalfSize(clipNumberComparison()));
	}

	/**clipNumberComparisonメソッド
	 *キーボードから入力を行う
	 * @return キーボードからの入力値
	 */
	public static String clipNumberComparison() {

		System.out.print("(" + INPUT_COUNT + ")回目予測数字を入力してください：");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String input = scan.nextLine();
		INPUT_COUNT++;

		return input;
	}

	/**
	 * checkNumberHalfSizeメソッド
	 * 入力された文字列に全角数字が入力されている場合に半角に変更する
	 * @param input 入力された文字列
	 * @return 全角数字を半角に変換後の文字列
	 */
	public static String checkNumberHalfSize(String inputStr) {
		StringBuffer sb = new StringBuffer(inputStr);
		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if (c >= '０' && c <= '９') {
				sb.setCharAt(i, (char) (c - '０' + '0'));
			}
		}
		return sb.toString();
	}

	/**
	 * clipNumberStoringメソッド
	 * 入力チェック、ヒット、ブローを数え表示を行う
	 * @param args 起動時引数
	 * @param input キーボードから入力された値
	 */
	public static void clipNumberStoring(String[] args, String input) {

		int hitCount = 0;
		int blowCount = 0;
		char[] clipNumber = input.toCharArray();
		char[] answer = args[0].toCharArray();

		@SuppressWarnings("unused")
		int inputNum = 0;
		boolean blowFlag = false;
		try {
			inputNum = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください。");
			clipNumberStoring(args, checkNumberHalfSize(clipNumberComparison()));
		}
		if (input.equals(GIVE_UP_NUMBER)) {
			System.out.println("正解は" + args[0] + "でした。");
			System.exit(0);
		}
		if (input.length() != DIGITNUMBERCHECK) {
			System.err.println("4桁の数字を入力してください。");
			clipNumberStoring(args, checkNumberHalfSize(clipNumberComparison()));
		}

		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < args[0].length(); j++) {
				if (clipNumber[i] == answer[i] && i == j) {
					hitCount++;
					answer[i] = ' ';
					clipNumber[i] = '　';
				}
			}
		}
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < args[0].length(); j++) {
				if (clipNumber[i] == answer[j]) {
					blowFlag = true;
				}
			}
			if (blowFlag) {
				blowCount++;
				blowFlag = false;
			}
			blowFlag = false;
		}
		if (hitCount == args[0].length()) {
			System.out.println("正解です");
			System.exit(0);
		}
		System.out.println("ヒット：" + hitCount + "ブロー：" + blowCount);
		if (hitCount != args[0].length()) {
			clipNumberStoring(args, checkNumberHalfSize(clipNumberComparison()));
		}
	}
}
