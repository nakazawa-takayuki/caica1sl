package kanayama.Ex0235;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 課題Ex0235<br>
 * キーボードから入力された0～255の範囲の10進数整数値を2進数と16進数に変換して出力する。
 */
public class Ex0235 {
	public static void main(String[] args){
		int inputNum = 0;

		Scanner inp = new Scanner(System.in);

		while(true) {
			System.out.println("0～255の範囲の10進数：");
			try {
				inputNum = inp.nextInt();
			}catch(InputMismatchException e) {
				System.out.print("整数以外が含まれています。");
				return;
			}

			if(!((0 <= inputNum)&&(inputNum <= 255))) {
				System.out.print("0～255で入力してください");
				continue;
			}
			break;
		}
		inp.close();
		System.out.println("2進数の変換結果 : " + inputNumBinaryConversion(inputNum));
		System.out.println("16進数の変換結果 : " + inputNumHexConversion(inputNum));
	}

	/**
	 * 16進数変換メソッド
	 * @return hexNum
	 */
	private static String inputNumHexConversion(int inputNum) {
		return String.format("%X", inputNum);
	}

	/**
	 * 2進数変換メソッド
	 * @return binaryNum
	 */
	private static String inputNumBinaryConversion(int inputNum) {
		return String.format("%8s", Integer.toBinaryString(inputNum & 0xFF)).replace(' ', '0');
	}

}
