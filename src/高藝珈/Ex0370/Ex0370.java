package 高藝珈.Ex0370;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 起動時引数として正解の4桁の数字を与える。
 * 999を入力してギブアップするか、正解を入力するまで予想数字の入力と当たり判定の結果を出力し続ける。
 * ヒット：位置も数字も一致している数
 * ブロー：位置は一致していないが、数字が一致している数
 *
 * @author 高藝珈
 */

public class Ex0370 {

	static final int DIGIT = 4;
	static final String GIVE_UP_NUMBER = "999";
	static final int INT_TO_CHAR = 48;

	public static void main(String[] args) {
		Ex0370 game = new Ex0370();
		game.play(null, args);
	}

	String hitAndBLOW = "";

	//ゲーム部
	@SuppressWarnings({ "resource" })
	public void play(int[] array, String[] args) {

		String answer = args[0];
		char[] result1 = answer.toCharArray();
		int[] answerArray = new int[DIGIT];
		for (int i = 0; i < DIGIT; i++) {
			answerArray[i] = result1[i] - INT_TO_CHAR;
		}

		if (args.length == 0) {
			System.out.println("引数が入っていない");
			return;
		} else if (args[0].length() != DIGIT) {
			System.out.println("引数が4桁ではない");
			return;
		}

		String answerStr = "";
		for (int i = 0; i < answerArray.length; i++) {
			answerStr = answerStr + answerArray[i];
		}

		int count = 0;
		String input1;

		while (true) {

			count++;

			System.out.println(hitAndBLOW + "(" + count + "回目）予測数字を入力してください：");

			//インプット
			Scanner scan = new Scanner(System.in);
			System.out.println("input number：");

			try {
				input1 = scan.nextLine();

			} catch (InputMismatchException e) {
				System.out.println("数字以外が入力されています");
				continue;
			}

			if (input1.length() != DIGIT && !input1.equals(GIVE_UP_NUMBER)) {
				System.out.println("4桁の数字もしくは999を入力してください");
				continue;
			}

			if (input1.equals(GIVE_UP_NUMBER)) {
				System.out.println("正解は:" + answerStr + "でした。");
				break;
			}

			char[] result2 = input1.toCharArray();
			int[] inputNumsArray = new int[DIGIT];
			for (int i = 0; i < inputNumsArray.length; i++) {
				inputNumsArray[i] = result2[i] - INT_TO_CHAR;
			}

			//答え判断
			compareAnswerAndInput(answerArray, inputNumsArray);

			//終了判断
			if (input1.equals(answerStr)) {
				System.out.println("おめでとー 正解です！");
				break;
			} else {
				System.out.println();
			}
		}
	}

	//答え判断方法
	public String compareAnswerAndInput(int[] answer, int[] inputs) {
		int hit = 0;
		int blow = 0;
		for (int i = 0; i < answer.length; i++) {
			if (inputs[i] == answer[i]) {
				hit += 1;
				continue;
			} else {
				for (int j = 0; j < answer.length; j++) {
					if (inputs[i] == answer[j]) {
						blow += 1;
					}
				}
			}
		}
		hitAndBLOW = "ヒット：" + hit + " " + "ブロー：" + blow;
		return hitAndBLOW;
	}

}
