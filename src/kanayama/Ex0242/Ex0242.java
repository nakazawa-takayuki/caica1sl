package kanayama.Ex0242;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 課題Ex0242<br>
 * 整数値を入力し、その行数分の二等辺三角形を出力する。
 */
public class Ex0242 {
	public static void main(String[] args){
		int inputNum = 0;
		Scanner inp = new Scanner(System.in);

		while(true) {
			System.out.println("input number：");
			try {
				inputNum = inp.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("整数以外が含まれています。");
				inp.next();
				continue;
			}
			break;
		}
		inp.close();
		if( 0 < inputNum) {
			makeTriangle(inputNum);
		}else {
			makeMinusTriangle(inputNum);
		}
	}

	/**
	 * 入力値から、その行数分の二等辺三角形を描画する。
	 */
	private static void makeTriangle(int inputNum) {
		for(int column = 0; column < inputNum; column++) {
			for(int spaceLine = 0; spaceLine < column; spaceLine++) {
				System.out.print("  ");
			}
			for(int symbolLine = 0; symbolLine <= column * 2 - 2 ; symbolLine++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	/**
	 * 入力値から、その行数分の二等辺三角形を描画する。
	 * マイナス値の場合逆二等辺三角形を描画する。
	 */
	private static void makeMinusTriangle(int inputNum) {
		for(int column = Math.abs(inputNum); 0 < column; column--) {
			for(int spaceLine = 0; spaceLine < Math.abs(inputNum) - column ; spaceLine++) {
				System.out.print("  ");
			}
			for(int symbolLine = 0; symbolLine <= column * 2 - 2 ; symbolLine++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
