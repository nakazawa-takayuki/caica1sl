package 高藝珈.Ex0370;

import java.util.InputMismatchException;
//import java.util.Random;
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

	public static void main(String[] args) {

		Ex0370 game = new Ex0370();

		String str1 = args[0];
		char[] result = str1.toCharArray();
		int[] array = new int[4];

		for (int i = 0; i < 4; i++) {
			array[i] = result[i] - 48;
		}

		if (args.length == 0) {
			System.out.println("引数が入っていない");
			return;
		} else if (args[0].length() != 4) {
			System.out.println("引数が4桁ではない");
			return;
		}

		game.play(array);

	}

	//変数の初期化
	int[] inputNumsArray = new int[4]; // 入力した答えが入る
	int hit = 0;
	int blow = 0;
	int count = 0;
	String input1;
	String numberStr = "";
	String str = "";

	//ゲーム部
	@SuppressWarnings({ "resource" })
	public void play(int[] array) {

		for (int i = 0; i < array.length; i++) {
			numberStr = numberStr + array[i];
		}

		while (true) {

			count++;

			System.out.println(str + "(" + count + "回目）予測数字を入力してください：");

			//インプット
			Scanner scan = new Scanner(System.in);
			System.out.println("input number：");

			try {
				input1 = scan.nextLine();

			} catch (InputMismatchException e) {
				System.out.println("数字以外が入力されています");
				continue;
			}

			if (input1.length() != 4 && !input1.equals("999")) {
				System.out.println("4桁の数字もしくは999を入力してください");
				continue;
			}

			if (input1.equals("999")) {
				System.out.println("正解は:" + numberStr + "でした。");
				break;
			}

			char[] result = input1.toCharArray();
			int[] inputNumsArray = new int[4];
			for (int i = 0; i < inputNumsArray.length; i++) {
				inputNumsArray[i] = result[i] - 48;
			}

			//答え判断
			compare(array, inputNumsArray);

			//終了判断 ヒットが4つになったら終了
			if (hit == 4) {
				System.out.println("おめでとー 正解です！");
				break;
			} else {
				System.out.println();
			}
		}
	}

	//答え判断方法
	public String compare(int[] answer, int[] inputs) {
		hit = 0;
		blow = 0;
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
		str = "ヒット：" + hit + " " + "ブロー：" + blow;
		return str;
	}

}
