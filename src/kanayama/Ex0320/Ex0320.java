package kanayama.Ex0320;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 課題Ex0256<br>
 * キーボードから入力した整数値ｎの階乗を計算して出力する。
 * 繰り返し文でもプログラムは作成できるが、今回は再帰呼び出しで作成すること。
 *
 * @author kanayama
 */
public class Ex0320 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int inputNum = 0;

		System.out.println("input number :");

		try {
			inputNum = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("整数値を入力してください。");
			return;
		}
		scn.close();

		if (inputNum < 0) {
			System.out.println("0以上の整数値を入力してください");
			return;
		}

		System.out.println( inputNum + "の階乗は" + factorial(inputNum) + "です");
	}


	static int factorial(int inputNum){
		if (inputNum <= 1) {
			return 1;
		}
		return factorial(inputNum - 1) * inputNum;
	}
}
