package tashirotakumi.Ex0370;

import java.util.Scanner;

public class Ex0370 {
	public static int gameCount = 1;
	public static final int NO_NUMBER = -1;
	public static final int ONE_DIGITS = 9;
	public static final int DIGITNUMBER_CHECK = 4;
	public static final String GIVE_UP_NUMBER = "999";

	public static void main(String[] args) {
		if (args == null) {
			System.out.println("引数が未入力です。");
		}

		String answer = args[0];
		startGame(answer);

	}

	public static void startGame(String answer) {

		// answerが重複していない値であることを保証
		checkDuplicationNumber(answer);

		while (true) { // ゲームが終了するまで無限ループする

			System.out.print("（" + gameCount + "）回目予測数字を入力してください：");

			String inputNumber = inputNumberReception();
			if (inputNumber.equals(GIVE_UP_NUMBER)) { // 999 だったら 正解表示 してberak

				System.out.println("正解は" + answer + "です");
				break;
			} else if (!numberCharactersCheck(inputNumber)) { // そうじゃなかったら 正規表現で4桁整数であることを保証
				continue;
			}

			// HitAndBlowゲームを実行
			System.out.println("ヒット：" + judgeHit(answer, inputNumber) + "ブロー："
					+ (judgeBlow(answer, inputNumber) - judgeHit(answer, inputNumber)) + "");
			if (judgeHit(answer, inputNumber) == DIGITNUMBER_CHECK) {
				System.out.println("正解です");
				System.out.println("正解までの回数は"+gameCount+"回です");
				break;
			}
			gameCount++;
		}
	}

	/**
	 * numberCharactersCheckメソッド
	 * 4桁チェックと整数チェックを行う。
	 * @param inputNumber 入力された値
	 * @return 入力チェックが問題ないかtrue、falseで返す
	 */
	public static boolean numberCharactersCheck(String inputNumber) {

		if (inputNumber.length() != DIGITNUMBER_CHECK) {
			System.out.println("4桁ではありません");
			return false;
		}

		try {
			Integer.parseInt(inputNumber);
		} catch (NumberFormatException e) {
			return false;

		}
		char[] clipNumber = inputNumber.toCharArray();

		for (int i = 0; i < inputNumber.length(); i++) {
			for (int j = i + 1; j < inputNumber.length(); j++) {
				if (clipNumber[i] == clipNumber[j]) {
					System.out.println("重複する値を入力しないでください。");
					return false;
				}
			}
		}
		return true;
	}
	/**
	 * judgeHit
	 * 入力と正答で位置数字どちらも同じものがあるかを判断する
	 * @param answer 起動時引数(正答)
	 * @param inputNumber 入力値(予想数字)
	 * @return
	 */
	private static int judgeHit(String answer, String inputNumber) {

		int hitCount = 0;

		for (int i = 1; i <= ONE_DIGITS; i++) {
			if ((answer.indexOf("" + i)) == (inputNumber.indexOf("" + i)) && answer.indexOf("" + i) != NO_NUMBER) {
				hitCount++;
			}
		}
		return hitCount;
	}

	private static int judgeBlow(String answer, String inputNumber) {

		int blowCount = 0;

		for (int i = 0; i <= ONE_DIGITS; i++) {
			if (answer.indexOf("" + i) != NO_NUMBER && inputNumber.indexOf("" + i) != NO_NUMBER) {
				blowCount++;
			}
		}
		return blowCount++;
	}

	/**
	 * inputNumberReceptionメソッド
	 * キーボードからの入力を受け付ける
	 * @return 入力された値
	 */
	public static String inputNumberReception() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String inputNumber = scan.nextLine();

		return inputNumber;

	}

	/**
	 * checkDuplicationNumber
	 * 起動時引数の重複チェック
	 * @param answer 起動時引数
	 */
	public static void checkDuplicationNumber(String answer) {
		char[] answerDuplication = answer.toCharArray();
		for (int i = 0; i < answer.length(); i++) {
			for (int j = i + 1; j < answer.length(); j++) {
				if (answerDuplication[i] == answerDuplication[j]) {
					System.err.println("重複しない数字を起動時引数に設定してください。");
					System.exit(0);
				}
			}
		}
		if (answer.length() != DIGITNUMBER_CHECK) {
			System.out.println("起動時引数が4桁ではありません");
			System.exit(0);
		}
	}
}
//		String answer = answerInputCheck(args);
//
//		clipNumberStoring(answer, checkNumberHalfSize(clipNumberComparison()));
//	}
//
//	/**
//	 *
//	 * @return
//	 */
//	/**clipNumberComparisonメソッド
//	 *キーボードから入力を行う
//	 * @return キーボードからの入力値
//	 */
//	public static String clipNumberComparison() {
//
//		System.out.print("(" + INPUTCOUNT + ")回目予測数字を入力してください：");
//		@SuppressWarnings("resource")
//		Scanner scan = new Scanner(System.in); //キーボードからの入力
//		String input = scan.nextLine();
//		INPUTCOUNT++;
//		return input;
//	}
//
//	/**
//	 * answerInputCheckメソッド
//	 * 起動時引数が重複していないかチェックを行う
//	 * @param args 起動時引数
//	 */
//	public static String answerInputCheck(String[] args) {
//		char[] answer = null ;
//		try {
//			answer = args[0].toCharArray();
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println("起動時引数が入力されていません。終了します。");
//			System.exit(0);
//		}
//		if(answer.length!=4) {
//			System.err.println("起動時引数が4桁以外です。終了します。");
//			System.exit(0);
//		}
//		for (int i = 0; i < args[0].length(); i++) {
//			for (int j = i + 1; j < args[0].length(); j++) {
//				if (answer[i] == answer[j]) {
//					System.err.println("重複しない数字を起動時引数に設定してください。");
//					System.exit(0);
//				}
//			}
//		}
//
//		return args[0];
//	}
//
//	/**
//	 * checkNumberHalfSizeメソッド
//	 * 入力された文字列に全角数字が入力されている場合に半角に変更する
//	 * @param input 入力された文字列
//	 * @return 全角数字を半角に変換後の文字列
//	 */
//	public static String checkNumberHalfSize(String inputStr) {
//
//		StringBuffer sb = new StringBuffer(inputStr);
//		for (int i = 0; i < sb.length(); i++) {
//			char c = sb.charAt(i);
//			if (c >= '０' && c <= '９') {
//				sb.setCharAt(i, (char) (c - '０' + '0'));
//			}
//		}
//		return sb.toString();
//	}
//
//	/**
//	 * clipNumberStoringメソッド
//	 * 入力チェック、ヒット、ブローを数え表示を行う
//	 * @param answer 正答
//	 * @param input キーボードから入力された値
//	 */
//	public static void clipNumberStoring(String answer, String input) {
//
//		int hitCount = 0;
//		int blowCount = 0;
//		int inputNum = 0;
//
//		try {
//			inputNum = Integer.parseInt(input);
//		} catch (NumberFormatException e) {
//			System.err.println("数字を入力してください。");
//			clipNumberStoring(answer, checkNumberHalfSize(clipNumberComparison()));
//		}
//
//		if (input.equals(GIVE_UP_NUMBER)) {
//			System.out.println("正解は" + answer + "でした。");
//			System.exit(0);
//		}
//
//		if (input.length() != DIGITNUMBERCHECK) {
//			System.err.println("4桁の数字を入力してください。");
//			clipNumberStoring(answer, checkNumberHalfSize(clipNumberComparison()));
//		}
//
//		char[] clipNumber = input.toCharArray();
//		for (int i = 0; i < input.length(); i++) {
//			for (int j = i + 1; j < answer.length(); j++) {
//				if (clipNumber[i] == clipNumber[j]) {
//					System.out.println(" ");
//					System.err.println("重複する値を入力しないでください。");
//					System.out.println("数字を入力してください。");
//					clipNumberStoring(answer, checkNumberHalfSize(clipNumberComparison()));
//				}
//			}
//		}
//
//		char[] answerChars = answer.toCharArray();
//		boolean blowFlag = false;
//		boolean hitFlag = false;
//		for (int i = 0; i < input.length(); i++) {
//			for (int j = 0; j < answer.length(); j++) {
//				if (clipNumber[i] == answerChars[i]) {
//					hitCount++;
//					hitFlag = true;
//					break;
//				} else if (clipNumber[i] == answerChars[j]) {
//					blowFlag = true;
//				}
//			}
//
//			if (blowFlag && (!hitFlag)) {
//				blowCount++;
//				blowFlag = false;
//				hitFlag = false;
//			}
//
//			hitFlag = false;
//			blowFlag = false;
//		}
//
//		if (hitCount == answer.length()) {
//			System.out.println("正解です");
//			System.exit(0);
//		}
//
//		System.out.println("ヒット：" + hitCount + "ブロー：" + blowCount);
//
//		if (hitCount != answer.length()) {
//			clipNumberStoring(answer, checkNumberHalfSize(clipNumberComparison()));
//		}
//	}
//}
