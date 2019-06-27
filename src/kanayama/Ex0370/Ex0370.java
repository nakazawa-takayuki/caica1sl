package kanayama.Ex0370;

import java.util.Scanner;

/**
 * 正解の値を入力するまで予想数字の入力と当たり判定の結果を出力する
 * <br>正解値：起動時引数
 *
 * @author kanayama
 */
public class Ex0370 {
	static Scanner scn = new Scanner(System.in);
		static final String GIVEUP_NUMBER = "999";
		static final int LIMIT_DIGIT_FOUR= 4;

	/**
	 * メインメソッド
	 */
	public static void main(String[] args){
		char[] answerArray;
		char[] inputValueArray;
		int count = 1;

		if(args.length == 0) {
			System.out.println("起動値引数が入力されていません");
			return;
		}
		if(args.length != LIMIT_DIGIT_FOUR) {
			System.out.println("起動値引数が4桁ではありません");
			return;
		}

		String answer =  args[0];
		answerArray = arrangement(answer);//char配列に格納

		while(true) {
			System.out.print("( " + count + "回目 )予測数字を入力してください：");
			String inputValue = getInputValue();

			if(inputValue.equals(answer)) {
				System.out.print("正解です");
				break;
			} else if(inputValue == GIVEUP_NUMBER){
				System.out.print("正解は" + answer + "でした。");
				break;
			} else {
				inputValueArray = arrangement(inputValue);
				hitAndBlow(inputValueArray,answerArray);
			}
			count++;
		}
		scn.close();
	}

	/**
	 * ヒット又はブローか判定して出力する
	 * <br>ヒット：位置も数字も一致している数
	 * <br>ブロー：位置は一致していないが、数字が一致している数
	 */
	private static void hitAndBlow(char[] inputValueArray, char[] answerArray) {
		int hit = 0;
		int blow = 0;
		for(int i = 0; i < LIMIT_DIGIT_FOUR; i++) {
			for(int j = 0; j < LIMIT_DIGIT_FOUR; j++) {
				if(answerArray[i] == inputValueArray[j]) {
					if(i == j) {
						hit++;
					} else {
						blow++;
					}
				}
			}
		}
		System.out.println(" ヒット  :" + hit + " ブロー :" + blow);
	}

	/**
	 * 入力メソッド：入力値が整数値4桁か判定する
	 * @return inputValue
	 */
	static String getInputValue() {
		String inputValue = null;

		while(true) {
			inputValue = scn.next();
			if(inputValue == GIVEUP_NUMBER) {
				break;
			}

			if(!inputValue.matches("^[0-9]*$")){
				System.out.println("整数値4桁を入力してください：");
				continue;
			} else if(String.valueOf(inputValue).length() != LIMIT_DIGIT_FOUR) {
				System.out.println("整数値4桁を入力してください：");
				continue;
			}
			break;
		}
		return inputValue;
	}

	/**
	 * String文字列を一文字ずつchar配列に格納する
	 * @return iresult
	 */
	static char[] arrangement(String inputValue) {
		char[] resultArray = inputValue.toCharArray();
		return resultArray;
	}
}
