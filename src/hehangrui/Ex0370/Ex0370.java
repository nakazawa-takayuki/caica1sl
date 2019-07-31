package hehangrui.Ex0370;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 問題
 * 起動時引数として正解の4 桁の数字を与える.
 * 999を入力してギブアップするか、正解を入力するまで予想数字の入力と当たり判定の結果を出力し続ける.
 * ヒット：位置も数字も一致している数.
 * ブロー：位置は一致していないが、数字が一致している数.
 *
 * @author Adrian
 */
public class Ex0370 {

	//定数宣言
	final static int ANSWER_SIZE = 4;
	final static String GIVE_UP = "999";
	static int count = 1;

	@SuppressWarnings("resource")

	/**
	 * 入力値を追加、結果を出力するメインメソッド
	 * @param args
	 */
	public static void main(String[] args) {

		//キーボード入力欄
		while (true) {

			Scanner scan = new Scanner(System.in);
			System.out.print("(" + count + "回目)予測数字を入力してください： ");
			String answerStr = scan.nextLine();

			//引数のない場合にコメント
			if (args.length == 0) {
				System.out.println("引数を入力してください。");
				return;
			}

			//文字のない場合にコメント
			if (answerStr.isEmpty()) {
				System.out.println("数字を入力してください。");
				return;
			}

			//引数を分割する
			int[] rightAnswer = Stream.of(args[0].split(""))
					.mapToInt(Integer::parseInt)
					.toArray();

			//入力値を分割する
			int[] userAnswer = Stream.of(answerStr.split(""))
					.mapToInt(Integer::parseInt)
					.toArray();

			//999を入力すると正解を出す
			if (answerStr.equals(GIVE_UP)) {
				System.out.println("正解は" + args[0] + "でした。");
				break;
			}
			//入力値の桁数を判定する
			else if (userAnswer.length != ANSWER_SIZE) {
				System.out.println("四桁の数字を入力してください。");
				return;
			}
			//結果を出力する
			else if (answerStr.equals(args[0])) {
				System.out.println("正解です。");
				break;
			} else {
				checkAnswer(rightAnswer, userAnswer);
				count++;
			}
		}

	}

	/**
	 * 解答と照らし合わせるメソッド
	 * @param rightAnswer
	 * @param userAnswer
	 */
	public static void checkAnswer(int[] rightAnswer, int[] userAnswer) {
		int hit = 0;
		int blow = 0;
		for (int i = 0; i < rightAnswer.length; i++) {
			for (int j = 0; j < userAnswer.length; j++) {
				if (rightAnswer[j] == userAnswer[i]) {
					if (j == i) {
						hit++;
					} else {
						blow++;
					}
				}
			}
		}
		System.out.println(hit + " hit  " + blow + " blow" + "\n");

	}

}
