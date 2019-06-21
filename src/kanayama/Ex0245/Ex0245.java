package kanayama.Ex0245;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 課題Ex0245<br>
 * キーボードから2つの整数値を入力し、最大公約数を出力する。
 */
public class Ex0245 {
	public static void main(String[] args){
		int inputNum1 = 0;
		int inputNum2 = 0;
		Scanner inp = new Scanner(System.in);
		while(true) {
			System.out.println("input number1：");
			try {
				inputNum1 = inp.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("整数以外が含まれています。");
				inp.next();
				continue;
			}
			if(checkInputNum(inputNum1)) {
				break;
			}
		}
		while(true) {
			System.out.println("input number2：");
			try {
				inputNum2 = inp.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("整数以外が含まれています。");
				inp.next();
				continue;
			}
			if(checkInputNum(inputNum2)) {
				break;
			}
		}
		inp.close();

		/*inputNum1 < inputNum2の場合入れ替える*/
		if(inputNum1 > inputNum2) {
			System.out.println("最大公約数 = " + outputCommonDivisor(inputNum1,inputNum2));
		}else {
			System.out.println("最大公約数 = " + outputCommonDivisor(inputNum2,inputNum1));
		}
	}

	/**
	 * 入力値チェック
	 * @return result
	 */
	private static boolean checkInputNum(int inputNum) {
		boolean result = true;
		if(inputNum < 0) {
			System.out.println("マイナス値が入力されています。");
		}
		return result;
	}

	/**
	 * 二つの入力値の最大公約数を求める
	 * @return commonDivisor
	 */
	private static int outputCommonDivisor(int inputNum1,int inputNum2) {
		int commonDivisor = inputNum1 % inputNum2;

		while(commonDivisor != 0){
			inputNum1 = inputNum2;
			inputNum2 = commonDivisor;
			commonDivisor = inputNum1 % inputNum2;
		}
		return inputNum2;
	}
}
